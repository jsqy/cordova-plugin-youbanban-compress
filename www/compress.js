var exec = require('cordova/exec');

exports.setlocation = function(success, error,info) {
    exec(success, error, "compress", "setlocation", info);
};
exports.getCamera = function(success, error,info) {
  exec(success, error, "compress", "getCamera", info);
};


