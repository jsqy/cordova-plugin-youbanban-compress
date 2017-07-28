# cordova-plugin-youbanban-compress
    cordova plugin add https://github.com/jsqy/cordova-plugin-youbanban-compress.git
# controller
    var item = new Array();
    arr[0] = 100; // 图片的宽度
    arr[1] = 200; // 图片的高度
    arr[2] = "your image url";
    arr[3] = "your image url";
    arr[4] = "your image url";
    ...
    document.addEventListener('deviceready', function() {
      var compress = cordova.require('cordova-plugin-youbanban-compress.compress');
      compress.getCamera(function (message) {
        var imgPaths = message.split(",");
        for (var i = 0; i < imgPaths.length; i++) {
          alert(imgPaths[i]);
        }
      }, function (message) {
      }, item);
    });
