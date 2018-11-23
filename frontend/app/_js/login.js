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
                    // window.location.href = "cadastro.html";
                    window.location.replace("http://localhost:3000/index.html");
                }
            }
            // success: function (json, text) {
            //     window.location.href = "index.html";
            //     console.log(text);
            // },
            // error: function (request, status, error) {
            //     console.log("Erro " + error);
            // }
        })
    })
});