# cordova-plugin-youbanban-compress
    cordova plugin add https://github.com/jsqy/cordova-plugin-youbanban-compress.git
# controller
       var items = [];
          for(var i =0;i<$scope.imgs.length;i++){
            var item = {
              width:100,
              height:200,
              url:$scope.imgs[i]
            }
            items.push(item);
          }
          var compress = cordova.require('cordova-plugin-youbanban-compress.compress');
          compress.compress(function(message) {
            var imgPaths = message.split(",");
            if(message == ""){
              alert("并没有选择图片");
            }else{
              for(var i =0;i<imgPaths.length;i++){
                alert(imgPaths[i]);
              }
            }
          }, function(message) {
          }, items);
