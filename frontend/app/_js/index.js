$(function () {
    $(".form-login").submit(function (e) {
        e.preventDefault();
        $.ajax({
            type: 'post',
            url: 'http://localhost:8080/login',
            data: JSON.stringify({"cnpj": $("#user").val(), "senha": $("#senha").val()}),
            dataType: 'json',
            contentType: "application/json",
            statusCode: {
                200: function (response) {
                    response.responseText;
                    // window.location.href = "institucional.html";
                    if(window.location.href.includes('_html/')){
                        window.location.replace("dashboard.html");
                    }else{
                        window.location.replace("_html/dashboard.html");
                    }
                }
            }
        })
    })
});