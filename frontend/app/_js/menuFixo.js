$(function () {

    let menuOpen = false;

    /**
     * Função animada de abertura/fechamento do menu
     */
    $(".menu-link").on("click", function () {
        if (menuOpen === false) {
            $("nav").animate({"height": "200px"}, 250);
            $(".menu-float").animate({"margin-left": "0"}, 400);
            $(".seta").html('<img src="../img/seta cima giz.png" height="40"/>');
            menuOpen = true;
        } else {
            $("nav").animate({"height": "55px"}, 250);
            $(".menu-float").animate({"margin-left": "-2000px"}, 100);
            $(".seta").html('<img src="../img/seta baixo giz.png" height="40"/>');
            menuOpen = false;
        }
    });


    /**
     * Função que recolhe o menu com a tecla ESC
     */
    $(document).keyup(function (e) {
        if(e.keyCode === 27) {
            if(menuOpen === true) {
                $("nav").animate({"height": "55px"}, 250);
                $(".menu-float").animate({"margin-left": "-2000px"}, 100);
                $(".seta").html('<img src="../img/seta baixo giz.png" height="40"/>');
                menuOpen = false;
            }
        }
    });

    /**
     * Função que recolhe o menu ao clicar fora dele
     */
    $("section").on('click', function () {
        if(menuOpen === true) {
            $("nav").animate({"height": "55px"}, 250);
            $(".menu-float").animate({"margin-left": "-2000px"}, 100);
            $(".seta").html('<img src="../img/seta baixo giz.png" height="40"/>');
            menuOpen = false;
        }
    });

});