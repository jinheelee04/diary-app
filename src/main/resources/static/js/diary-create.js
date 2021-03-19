$(function(){

    $("input:checkbox#input-chk-prvt").on('click', function() {
        if ( $(this).prop('checked') ) {
            $("div.add-members").hide();
            $(this).val("Y");
        }
        else {
            $("div.add-members").show();
            $(this).val("N");
        }
    });

});