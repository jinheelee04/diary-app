var diary = {
    create : function(){
        var diaryNm = $("input[name='diaryNm']").val();
        var prvtYn = $("input[name='prvtYn']").val();

        var data = {
            "diaryNm": diaryNm,
            "prvtYn" : prvtYn
        };
        console.log("data=",data);
        $.ajax({
            type:'POST',
            url:'/diary/create',
            dataType:'json',
            beforeSend : function(xhr){   /*데이터를 전송하기 전에 헤더에 csrf값을 설정한다*/
                       	    xhr.setRequestHeader(header, token);
                         },
            contentType:'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function(){
            alert('다이어리가 생성되었습니다');
            location.reload();
        }).fail(function(error){
            alert('생성 실패!');
        });
    }
};