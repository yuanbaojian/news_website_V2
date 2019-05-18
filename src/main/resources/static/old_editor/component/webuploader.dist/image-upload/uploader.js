(function( factory ) {
    if ( !window.jQuery ) {
        alert('jQuery is required.')
    }

    jQuery(function() {
        factory.call( null, jQuery );
    });
})(function( $ ) {


    uploader.on( 'uploadProgress', function( file, percentage ) {
        var $li = $( '#'+file.id ),
            $percent = $li.find('.progress span');

        // 避免重复创建
        if ( !$percent.length ) {
            $percent = $('<p class="progress"><span></span></p>')
                .appendTo( $li )
                .find('span');
        }

        $percent.css( 'width', percentage * 100 + '%' );
    });

// 文件上传成功，给item添加成功class, 用样式标记上传成功。
    uploader.on( 'uploadSuccess', function( file,response ) {
        $( '#'+file.id ).addClass('upload-state-done');

        console.log(response.id);
        var t_url2=response.id;
        console.log(t_url2);
        $('#touxiang').val(response.id);
        $t_url=$('#touxiang').val();
        console.log("$t"+$t_url);
        $.ajax({
            type:'post',
            dataType:'json',
            url:'/touxiangurl',
            data:{"t_url":$t_url},
            success:function (data) {
                if (data.error=='success'){
                    alert("修改成功");
                    history.go(0);
                }
            }

        });
    });

// 文件上传失败，显示上传出错。
    uploader.on( 'uploadError', function( file ) {
        var $li = $( '#'+file.id ),
            $error = $li.find('div.error');

        // 避免重复创建
        if ( !$error.length ) {
            $error = $('<div class="error"></div>').appendTo( $li );
        }

        $error.text('上传失败');
    });

// 完成上传完了，成功或者失败，先删除进度条。
    uploader.on( 'uploadComplete', function( file ) {
        $( '#'+file.id ).find('.progress').remove();
    })
});