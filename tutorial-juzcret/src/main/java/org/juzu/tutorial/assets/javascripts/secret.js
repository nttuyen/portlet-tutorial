(function($) {
  $(document).on('click.juzu.secret.addLike', '.btn-like', function() {
    var jLike = $(this);
    var jSecret = jLike.closest('.secret');
    var secretId = jSecret.attr('data-secretId');
    
    jLike.jzAjax('JuZcretApplication.addLike()', {
      data: {'secretId': secretId},
      success: function(data) {
        jSecret.find('.like-list').html(data);
      }
    });
    return false;
  });
  
  $(document).on('click.juzu.secret.addComment', '.btn-comment', function() {
    var jComment = $(this);
    var jSecret = jComment.closest('.secret');
    var secretId = jSecret.attr('data-secretId');
    
    jComment.jzAjax('JuZcretApplication.addComment()', {
      data: {'secretId': secretId, 'content': jComment.prev('input').val()},
      success: function(data) {
        if (typeof(data) == 'string') {
          //error response
          alert(data);
        } else {
          //update html
          var cList = "";
          $(data).each(function(idx, elem) {
            if (elem.content) {
              cList += "<li><div>" + elem.content + "</div></li>";             
            }          
          });
          var html = jSecret.find('.comment-list').html();
          jSecret.find('.comment-list').html(html + cList);          
        }
      }
    });
    return false;
  });
})($);