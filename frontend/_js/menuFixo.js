$(function () {

    let menuOpen = false;

    /**
     * função animada de abertura do menu
     */
    $(".menu-link").on("click", function () {
        if (menuOpen === false) {
            $("nav").animate({"height": "550px"}, 250);
            $(".menu-float").animate({"margin-left": "0"}, 400);
            $(".seta").html('<img src="../img/seta cima giz.png" height="40"/>');
            menuOpen = true;
        } else {
            $("nav").animate({"height": "55px"}, 250);
            $(".menu-float").animate({"margin-left": "-1400px"}, 100);
            $(".seta").html('<img src="../img/seta baixo giz.png" height="40"/>');
            menuOpen = false;
        }
    });

});