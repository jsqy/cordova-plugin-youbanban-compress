var exec = require('cordova/exec');

exports.setlocation = function(success, error,info) {
    exec(success, error, "compress", "setlocation", info);
};
exports.compress = function(success, error,info) {
  exec(success, error, "compress", "compress", info);
};


