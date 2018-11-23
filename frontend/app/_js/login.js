$(function () {
    $(".form-login").submit(function (e) {
        e.preventDefault();
        $.ajax({
            type: 'post',
            url: 'http://localhost:8080/login',
            data: JSON.stringify({"cnpj": $("#user").val(), "senha": $("#senha").val()}),
            dataType: 'json',
            contentType: "application/json",
            success: function (json) {
                console.log(json.status);
                // if (json.status == 'OK') {
                //     window.location.href="http://www.example.com";
                // } else {
                //     alert('não logou');
                // }
            }
        })
    })
});