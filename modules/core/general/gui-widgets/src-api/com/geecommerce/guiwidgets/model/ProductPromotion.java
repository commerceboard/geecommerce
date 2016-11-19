package com.geecommerce.guiwidgets.model;

import com.owlike.genson.annotation.JsonIgnore;
import com.geecommerce.core.enums.ObjectType;
import com.geecommerce.core.service.AttributeSupport;
import com.geecommerce.core.service.api.Model;
import com.geecommerce.core.service.api.MultiContextModel;
import com.geecommerce.core.type.ContextObject;
import com.geecommerce.core.type.Id;
import com.geecommerce.mediaassets.model.MediaAsset;

public interface ProductPromotion extends MultiContextModel {

    public Id getId();

    public ProductPromotion setId(Id id);

    public String getKey();

    public ProductPromotion setKey(String key);

    public ContextObject<String> getLabel();

    public ProductPromotion setLabel(ContextObject<String> label);

    public ProductPromotion setLimit(Integer limit);

    public Integer getLimit();

    public Id getTargetObjectId();

    public ProductPromotion setTargetObjectId(Id targetObjectId);

    public ObjectType getTargetObjectType();

    public ProductPromotion setTargetObjectType(ObjectType targetObjectType);

    public boolean isUseTargetObjectLabel();

    public ProductPromotion setUseTargetObjectLabel(boolean useTargetObjectLabel);

    public String getDisplayLabel();

    @JsonIgnore
    public String getDisplayURI();

    @JsonIgnore
    public boolean isForProductList();

    @JsonIgnore
    public boolean isForProduct();

    public MediaAsset getTeaserImage();

    public ProductPromotion setTeaserImage(MediaAsset teaserImage);

    public Id getTeaserImageId();

    public ProductPromotion setTeaserImageId(Id teaserImageId);

    public ContextObject<Boolean> getEnabled();

    public ProductPromotion setEnabled(ContextObject<Boolean> enabled);

    static final class Col {
	public static final String ID = "_id";

	public static final String KEY = "key";
	public static final String LABEL = "label";
	public static final String LIMIT = "limit";
	public static final String TARGET_OBJECT_ID = "tar_obj";
	public static final String TARGET_OBJECT_TYPE = "tar_obj_type";
	public static final String TARGET_OBJECT_LABEL = "tar_obj_label";
	public static final String TEASER_IMAGE = "teaser_image";
	public static final String ENABLED = "enabled";
    }
}
