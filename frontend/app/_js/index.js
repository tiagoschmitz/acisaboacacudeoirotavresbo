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
<<<<<<< HEAD
                    // window.location.href = "institucional.html";
                    if(window.location.href.includes('_html/')){
=======
                    // window.location.href = "cadastro.html";
                    if(window.location.href.includes('_html/' )){
>>>>>>> 1bc5f323d8c62668cc0e59b94a746af822fe5f45
                        window.location.replace("dashboard.html");
                    }else{
                        window.location.replace("_html/dashboard.html");
                    }
                }
            }
        })
    })
});