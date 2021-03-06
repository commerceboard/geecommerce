define([ 'durandal/app', 'knockout', 'plugins/router', 'gc/gc', 'gc-media-asset', 'knockout-validation', 'gc-media-asset/util'  ], function(app, ko, router, gc, mediaAssetAPI, validation, mediaAssetUtil) {

    //-----------------------------------------------------------------
    // Controller
    //-----------------------------------------------------------------
    function MediaAssetDetailsIndexController() {

        // Make sure that this object is being called with the 'new' keyword.
        if (!(this instanceof MediaAssetDetailsIndexController)) {
            throw new TypeError("MediaAssetDetailsIndexController constructor cannot be called as a function.");
        }

        this.app = gc.app;
        this.tab = null;
        /*        this.mediaAssetId = ko.observable();*/

        // Solves the 'this' problem when a DOM event-handler is fired.
        _.bindAll(this, 'activate');
    }

    MediaAssetDetailsIndexController.prototype = {
        constructor : MediaAssetDetailsIndexController,
        pageTitle : function() {
            var self = this;
            var title = 'app:modules.media-asset.detailsTitle';
            return title;
        },
        pageDescription : 'app:modules.media-asset.detailsSubtitle',
        activate : function(data) {
            var self = this;
            self.tab = data.tab;
            /*         self.mediaAssetId(data);
             */
        },
        attached : function() {
            var self = this;

            Dropzone.autoDiscover = false;

            /* Dropzone magic. Automatically uploads file and adds the saved entry to list of slides in slideShowVM. */
            $('#dz-new-media-asset' + self.tab.id).each(function( index, el ) {
                $form = $(this).get(0);

                if(!self.dzInited){
                    self.dzInited = true;
                    var dz = new Dropzone($form, { url: '/api/v1/media-assets/' + self.tab.id + '/'});
/*                    dz.on("sending", function(file, xhr, formData) {
                        var activeStore = gc.app.activeStore();

                        if(!_.isEmpty(activeStore) && !_.isUndefined(activeStore.id)) {
                            xhr.setRequestHeader('X-CB-StoreContext', activeStore.id);
                        }
                    });*/

                    dz.on("success", function(file, data) {
                        self.tab.vm.files(data.mediaAsset.files);
                        dz.removeFile(file);
                    });
                }
            });

            $('#dz-update-media-asset' + self.tab.id).each(function( index, el ) {
                $form = $(this).get(0);

                if(!self.dzInited){
                    self.dzInited = true;
                    var dz = new Dropzone($form, {
                        url: '/api/v1/media-assets/update-file/' + self.tab.id + '/',

                    });
/*                    dz.on("sending", function(file, xhr, formData) {
                        var activeStore = gc.app.activeStore();

                        if(!_.isEmpty(activeStore) && !_.isUndefined(activeStore.id)) {
                            xhr.setRequestHeader('X-CB-StoreContext', activeStore.id);
                        }
                    });*/

                    dz.on("success", function(file, data) {
                        // Remove file from preview.
                        mediaAssetUtil.addMediaAsset(data.data.mediaAsset, self.tab.vm.controller, self.tab.vm);
                        dz.removeFile(file);

                        /*      router.navigate('//media-assets/details/' + data.data.mediaAsset.id);*/

                    });
                }
            });
        },
        compositionComplete : function() {
        },
        detached : function() {
        },
        deactivate : function() {
        }
    }

    return MediaAssetDetailsIndexController;
});