package com.geecommerce.core.batch.dataimport.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.geecommerce.core.App;
import com.geecommerce.core.service.AbstractModel;
import com.geecommerce.core.service.annotation.Column;
import com.geecommerce.core.service.annotation.Model;
import com.geecommerce.core.type.ContextObject;
import com.geecommerce.core.type.Id;
import com.google.inject.Inject;

@Model("import_profiles")
public class DefaultImportProfile extends AbstractModel implements ImportProfile {
    private static final long serialVersionUID = -2155047709349897745L;

    @Column(Col.ID)
    protected Id id = null;

    @Column(Col.TARGET_OBJECT_ID)
    protected Id targetObjectId = null;

    @Column(Col.TOKEN)
    protected String token;

    @Column(Col.NAME)
    protected ContextObject<String> name;

    @Column(Col.SETTINGS)
    protected Map<String, String> settings;

    @Column(Col.TO_SCOPES)
    protected Set<Id> toScopeIds;

    @Column(Col.DATA_LANGUAGES)
    protected Set<String> dataLanguages;

    @Column(Col.DATA_SCOPES)
    protected Set<Id> dataScopeIds;

    @Column(Col.FIELD_MAPPING)
    protected List<ImportField> fieldMapping = new ArrayList<>();

    @Inject
    protected App app;

    @Override
    public Id getId() {
        return id;
    }

    @Override
    public ImportProfile setId(Id id) {
        this.id = id;
        return this;
    }

    @Override
    public Id getTargetObjectId() {
        return targetObjectId;
    }

    @Override
    public ImportProfile setTargetObjectId(Id targetObjectId) {
        this.targetObjectId = targetObjectId;
        return this;
    }

    @Override
    public String getToken() {
        return token;
    }

    @Override
    public ImportProfile setToken(String token) {
        this.token = token;
        return this;
    }

    @Override
    public ContextObject<String> getName() {
        return name;
    }

    @Override
    public ImportProfile setName(ContextObject<String> name) {
        this.name = name;
        return this;
    }

    @Override
    public ImportProfile addField(String sourceColumnHeader, ContextObject<String> sourceColumnLabel, String destFieldExpression, boolean isAttribute) {
        ImportField field = app.model(ImportField.class)
            .setSourceColumnHeader(sourceColumnHeader)
            .setSourceColumnLabel(sourceColumnLabel)
            .setDestFieldExpression(destFieldExpression)
            .setAttribute(isAttribute);

        fieldMapping.add( field);

        return this;
    }

    @Override
    public List<ImportField> getFieldMapping() {
        return fieldMapping;
    }

    @Override
    public ImportProfile setFieldMapping(List<ImportField> fieldMapping) {
        this.fieldMapping = fieldMapping;
        return this;
    }

    @Override
    public Map<String, String> getSettings() {
        return settings;
    }

    @Override
    public ImportProfile setSettings(Map<String, String> settings) {
        this.settings = settings;
        return this;
    }

    @Override
    public String getSetting(String key) {
        return settings == null ? null : settings.get(key);
    }

    @Override
    public ImportProfile putSetting(String key, String value) {
        if (settings == null)
            settings = new HashMap<>();

        settings.put(key, value);

        return this;
    }

    @Override
    public Set<Id> getToScopeIds() {
        return toScopeIds;
    }

    @Override
    public ImportProfile setToScopeIds(Set<Id> toScopeIds) {
        this.toScopeIds = toScopeIds;
        return this;
    }

    @Override
    public ImportProfile addToScopeId(Id toScopeId) {
        if (toScopeIds == null)
            toScopeIds = new HashSet<>();

        toScopeIds.add(toScopeId);

        return this;
    }

    @Override
    public Set<String> getDataLanguages() {
        return dataLanguages;
    }

    @Override
    public ImportProfile setDataLanguages(Set<String> dataLanguages) {
        this.dataLanguages = dataLanguages;
        return this;
    }

    @Override
    public ImportProfile addDataLanguage(String dataLanguage) {
        if (dataLanguages == null)
            dataLanguages = new HashSet<>();

        dataLanguages.add(dataLanguage);

        return this;
    }

    @Override
    public Set<Id> getDataScopeIds() {
        return dataScopeIds;
    }

    @Override
    public void setDataScopeIds(Set<Id> dataScopeIds) {
        this.dataScopeIds = dataScopeIds;
    }

    @Override
    public ImportProfile addDataScopeId(Id dataScopeId) {
        if (dataScopeIds == null)
            dataScopeIds = new HashSet<>();

        dataScopeIds.add(dataScopeId);

        return this;
    }

    @Override
    public void fromMap(Map<String, Object> map) {
        List<Map<String, Object>> _fieldMapping = list_(map.get(Col.FIELD_MAPPING));

        fieldMapping.clear();

        for (Map<String, Object> innerMap : _fieldMapping) {
            ImportField importField = app.model(ImportField.class);
            importField.fromMap(innerMap);

            fieldMapping.add(importField);
        }
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> data = new LinkedHashMap<>(super.toMap());

        List<Map<String, Object>> _fieldMapping = new ArrayList<>();

        for (ImportField importField : fieldMapping) {
            _fieldMapping.add(importField.toMap());
        }

        data.put(Col.FIELD_MAPPING, _fieldMapping);

        return data;
    }

    @Override
    public String toString() {
        return "DefaultImportProfile [id=" + id + ", targetObjectId=" + targetObjectId + ", token=" + token + ", name=" + name + ", settings=" + settings + ", toScopeIds=" + toScopeIds
            + ", dataLanguages=" + dataLanguages + ", dataScopeIds=" + dataScopeIds + ", fieldMapping=" + fieldMapping + "]";
    }
}
