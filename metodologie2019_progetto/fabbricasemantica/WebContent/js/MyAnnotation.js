/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var quickstart;
(function (quickstart) {
    class MyAnnotation {
        static main(args) {
            let form = new quickstart.HTMLFormElementBuilder().action(MyAnnotation.SERVLET_URL).method().build();
            let labelInizio = new quickstart.HTMLLabelElementBuilder().textContent("7.Trdauci le seguenti parole nella tua lingua nativa").build();
            let divInizio = new quickstart.HTMLDivElementBuilder().build();
            $(divInizio).append(labelInizio);
            let labelParola1 = new quickstart.HTMLLabelElementBuilder().textContent("parola da tradurre").build();
            let casellaTraduzione1 = new quickstart.HTMLTextAreaElementBuilder().className("form-control").name("traduzione1").placeholder("Scrivi la traduzione qui...").build();
            let divParola1 = new quickstart.HTMLDivElementBuilder().build();
            $(divParola1).append(labelParola1).append(casellaTraduzione1);
            let labelParola2 = new quickstart.HTMLLabelElementBuilder().textContent("parola da tradurre").build();
            let casellaTraduzione2 = new quickstart.HTMLTextAreaElementBuilder().className("form-control").name("traduzione2").placeholder("Scrivi la traduzione qui...").build();
            let divParola2 = new quickstart.HTMLDivElementBuilder().build();
            $(divParola2).append(labelParola2).append(casellaTraduzione2);
            let labelParola3 = new quickstart.HTMLLabelElementBuilder().textContent("parola da tradurre").build();
            let casellaTraduzione3 = new quickstart.HTMLTextAreaElementBuilder().className("form-control").name("traduzione3").placeholder("Scrivi la traduzione qui...").build();
            let divParola3 = new quickstart.HTMLDivElementBuilder().build();
            $(divParola3).append(labelParola3).append(casellaTraduzione3);
            let labelParola4 = new quickstart.HTMLLabelElementBuilder().textContent("parola da tradurre").build();
            let casellaTraduzione4 = new quickstart.HTMLTextAreaElementBuilder().className("form-control").name("traduzione4").placeholder("Scrivi la traduzione qui...").build();
            let divParola4 = new quickstart.HTMLDivElementBuilder().build();
            $(divParola4).append(labelParola4).append(casellaTraduzione4);
            let labelParola5 = new quickstart.HTMLLabelElementBuilder().textContent("parola da tradurre").build();
            let casellaTraduzione5 = new quickstart.HTMLTextAreaElementBuilder().className("form-control").name("traduzione5").placeholder("Scrivi la traduzione qui...").build();
            let divParola5 = new quickstart.HTMLDivElementBuilder().build();
            $(divParola5).append(labelParola5).append(casellaTraduzione5);
            let labelParola6 = new quickstart.HTMLLabelElementBuilder().textContent("parola da tradurre").build();
            let casellaTraduzione6 = new quickstart.HTMLTextAreaElementBuilder().className("form-control").name("traduzione6").placeholder("Scrivi la traduzione qui...").build();
            let divParola6 = new quickstart.HTMLDivElementBuilder().build();
            $(divParola6).append(labelParola6).append(casellaTraduzione6);
            let labelParola7 = new quickstart.HTMLLabelElementBuilder().textContent("parola da tradurre").build();
            let casellaTraduzione7 = new quickstart.HTMLTextAreaElementBuilder().className("form-control").name("traduzione7").placeholder("Scrivi la traduzione qui...").build();
            let divParola7 = new quickstart.HTMLDivElementBuilder().build();
            $(divParola7).append(labelParola7).append(casellaTraduzione7);
            let bottoneNext = new quickstart.HTMLInputElementBuilder().type("submit").className("btn btn-primary").name("Next").value("Next").build();
            let divButtons = new quickstart.HTMLDivElementBuilder().className("form-group").build();
            let bottoneSkip = new quickstart.HTMLInputElementBuilder().type("submit").name("Skip").className("btn btn-primary").value("Skip").build();
            $(divButtons).append(bottoneNext).append(bottoneSkip);
            let labelLogout = new quickstart.HTMLLabelElementBuilder().textContent("Se vuoi effettuare il Logout ").build();
            let logout = new quickstart.HTMLAnchorElementBuilder().href(MyAnnotation.LOGOUT_URL).textContent(" Clicca qui").build();
            let linkHome = new quickstart.HTMLAnchorElementBuilder().href(MyAnnotation.HOME_URL).textContent("Home").build();
            let divLabelLogout = new quickstart.HTMLDivElementBuilder().build();
            $(divLabelLogout).append(labelLogout).append(logout).append(linkHome);
            $(form).append(divInizio);
            $(form).append(divParola1);
            $(form).append(divParola2);
            $(form).append(divParola3);
            $(form).append(divParola4);
            $(form).append(divParola5);
            $(form).append(divParola6);
            $(form).append(divParola7);
            $(form).append(divButtons);
            $(form).append(divLabelLogout);
            $("body").append(form);
            $(bottoneNext).width(200);
            $(bottoneSkip).width(200);
            $(bottoneNext).css("margin", "2% 0%");
            $(bottoneSkip).css("margin", "2% 0%");
            $(bottoneSkip).css("float", "right");
            $(linkHome).css("float", "right");
            $(labelLogout).css("color", "white");
            $(labelParola1).css("color", "white");
            $(labelParola2).css("color", "white");
            $(labelParola3).css("color", "white");
            $(labelParola4).css("color", "white");
            $(labelParola5).css("color", "white");
            $(labelParola6).css("color", "white");
            $(labelParola7).css("color", "white");
            $(labelInizio).css("color", "white");
            $("body").css("background-image", "url(https://media.giphy.com/media/TtTLEPsb3PvQQ/giphy.gif)");
            $(form).css("margin", "1% 1.5%");
            $.getJSON(MyAnnotation.REST_URL, "task=MY_ANNOTATION", ((labelParola7, labelParola1, labelParola2, labelParola3, labelParola4, labelParola5, labelParola6) => {
                return (result, a, ctx) => {
                    let json = result;
                    let sWord1 = (json["word1"]);
                    let sWord2 = (json["word2"]);
                    let sWord3 = (json["word3"]);
                    let sWord4 = (json["word4"]);
                    let sWord5 = (json["word5"]);
                    let sWord6 = (json["word6"]);
                    let sWord7 = (json["word7"]);
                    $(labelParola1).text(sWord1);
                    $(labelParola2).text(sWord2);
                    $(labelParola3).text(sWord3);
                    $(labelParola4).text(sWord4);
                    $(labelParola5).text(sWord5);
                    $(labelParola6).text(sWord6);
                    $(labelParola7).text(sWord7);
                    return null;
                };
            })(labelParola7, labelParola1, labelParola2, labelParola3, labelParola4, labelParola5, labelParola6));
            $.getJSON(MyAnnotation.AUTHENTICATION_URL, (result, a, ctx) => {
                let json = result;
                let sLogin = (json["isLoggedIn"]);
                if (((o1, o2) => { if (o1 && o1.equals) {
                    return o1.equals(o2);
                }
                else {
                    return o1 === o2;
                } })(sLogin, "false"))
                    window.location.href = MyAnnotation.LOGIN_URL;
                return null;
            });
        }
    }
    MyAnnotation.SERVLET_URL = "myAnnotation.jsp";
    MyAnnotation.REST_URL = "nextExample.jsp";
    MyAnnotation.AUTHENTICATION_URL = "isLoggedIn.jsp";
    MyAnnotation.LOGIN_URL = "login.html";
    MyAnnotation.HOME_URL = "home.html";
    MyAnnotation.LOGOUT_URL = "logout.jsp";
    quickstart.MyAnnotation = MyAnnotation;
    MyAnnotation["__class"] = "quickstart.MyAnnotation";
})(quickstart || (quickstart = {}));
quickstart.MyAnnotation.main(null);
