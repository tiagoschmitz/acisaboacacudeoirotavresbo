$(() => {

    //chamada do menu fixo
    $(".menuFixo").load("menuFixo.html");

    //chamada do rodapé fixo
    $(".footerFixo").load("footerFixo.html");

});


$(() => {

    $("#botaoAddAdm").submit((e) => {
        let j = JSON.stringify({
            "cnpj": $("#cnpjAdm").val(),
            "senha": $("#senhaAdm").val(),
        })
       alert(j)
        console.log(sessionStorage.getItem("token"))
        e.preventDefault();
        $.ajax({
            headers: {
                'Authorization': sessionStorage.getItem("token")
            },
            type: 'post',
            url: 'http://localhost:8080/logins/cadastro',
            data: JSON.stringify({
                "cnpj": $("#cnpjAdm").val(),
                "senha": $("#senhaAdm").val(),
            }),
            dataType: 'json',
            contentType: "application/json",
            statusCode: {
                200: (response) => {
                    response.responseText;
                }
            }
        })
    })
});

$(document).ready(() => {
    console.log(sessionStorage.getItem("token"))
})

// $(document).ready(function () {
//     let dados = [
//         {
//             "cnpj": "5",
//             "senha": "$2a$10$2SDgNxRz0VSl3H.ESQtkd.syQ.EtRmYCRuBUCwiiEY.4dqmSKRGcq",
//             "admin": true,
//             "_id": {
//                 "timestamp": 1543343857,
//                 "machineIdentifier": 16170271,
//                 "processIdentifier": 312,
//                 "counter": 13237601,
//                 "time": 1543343857000,
//                 "date": "2018-11-27T18:37:37.000+0000",
//                 "timeSecond": 1543343857
//             }
//         },
//         {
//             "cnpj": "11",
//             "senha": "$2a$10$ysNliO3AksE6a.cwOQjYNuyjzFX6VK/DVCogWlMF3I6Zmebo74MRi",
//             "admin": false,
//             "_id": {
//                 "timestamp": 1543343869,
//                 "machineIdentifier": 8935928,
//                 "processIdentifier": 11340,
//                 "counter": 7846976,
//                 "time": 1543343869000,
//                 "date": "2018-11-27T18:37:49.000+0000",
//                 "timeSecond": 1543343869
//             }
//         }
//     ]
//     // $each(dados,function (i) {
//     //     if()
//     // })
// })
//
// var content = "<table>"
// for (i = 0; i < 3; i++) {
//     content += '<tr><td>' + 'result ' + i + '</td></tr>';
// }
// content += "</table>"
//
// $('#here_table').append(content);