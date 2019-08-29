/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var quickstart;
(function (quickstart) {
    class Home {
        static main(args) {
            let form = new quickstart.HTMLFormElementBuilder().action("translationAnnotation.html").method().build();
            let image = new quickstart.HTMLInputElementBuilder().type("image").src("https://st.depositphotos.com/1745180/1354/i/950/depositphotos_13547685-stock-photo-play-button.jpg)").build();
            let divImgLinkata = new quickstart.HTMLDivElementBuilder().build();
            $(divImgLinkata).append(image);
            let labelLogout = new quickstart.HTMLLabelElementBuilder().textContent("Se vuoi effettuare il Logout ").build();
            let logout = new quickstart.HTMLAnchorElementBuilder().href("logout.jsp").textContent(" Clicca qui").build();
            let divLabelLogout = new quickstart.HTMLDivElementBuilder().build();
            $(divLabelLogout).append(labelLogout).append(logout);
            $(form).append(divImgLinkata);
            $(form).append(divLabelLogout);
            $("body").append(form);
            $(image).width(250);
            $(image).css("margin", "10% 38%");
            $(labelLogout).css("color", "white");
            $("body").css("background-image", "url(https://media.giphy.com/media/TtTLEPsb3PvQQ/giphy.gif)");
            $.getJSON(Home.AUTHENTICATION_URL, (result, a, ctx) => {
                let json = result;
                let sLogin = (json["isLoggedIn"]);
                if (((o1, o2) => { if (o1 && o1.equals) {
                    return o1.equals(o2);
                }
                else {
                    return o1 === o2;
                } })(sLogin, "false"))
                    window.location.href = Home.LOGIN_URL;
                return null;
            });
        }
    }
    Home.REST_URL = "nextExample.jsp";
    Home.AUTHENTICATION_URL = "isLoggedIn.jsp";
    Home.LOGIN_URL = "login.html";
    quickstart.Home = Home;
    Home["__class"] = "quickstart.Home";
})(quickstart || (quickstart = {}));
quickstart.Home.main(null);
