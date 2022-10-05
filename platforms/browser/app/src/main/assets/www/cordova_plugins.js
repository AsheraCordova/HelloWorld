cordova.define('cordova/plugin_list', function(require, exports, module) {
  module.exports = [
    {
      "id": "com.ashera.core.coreManager",
      "file": "plugins/com.ashera.core/core/browser/www/coreManager.js",
      "pluginId": "com.ashera.core",
      "clobbers": [
        "coreManager"
      ]
    },
    {
      "id": "com.ashera.core.coreAddRes",
      "file": "plugins/com.ashera.core/core/browser/www/js/add_res.js",
      "pluginId": "com.ashera.core",
      "runs": true
    },
    {
      "id": "com.ashera.core.layoutAddRes",
      "file": "plugins/com.ashera.core/layout/browser/www/js/add_res.js",
      "pluginId": "com.ashera.core",
      "runs": true
    }
  ];
  module.exports.metadata = {
    "cordova-plugin-whitelist": "1.3.5",
    "com.ashera.core": "1.0"
  };
});