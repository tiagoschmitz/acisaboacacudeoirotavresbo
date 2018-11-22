$(function () {
    $(".form-login").submit(function (e) {
        e.preventDefault();
        console.log($(".form-login").serialize());
        $.ajax({
            type: 'post',
            url: 'http://localhost:8080/login',
            data: $(".form-login").serialize(),
            dataType: 'json',
            contentType: "application/javascript; charset=utf-8",
            success: function (json) {
               if(json.status=='OK'){
                   alert('sucesso');
               }else{
                   alert('não logou');
               }
            }
        })
        // data = {"cnpj": "5", "senha": "123"};
        // $.post("http://localhost:8080/login", function (data) {
        //     alert("Data loaded " + data)
        // });

    })

});