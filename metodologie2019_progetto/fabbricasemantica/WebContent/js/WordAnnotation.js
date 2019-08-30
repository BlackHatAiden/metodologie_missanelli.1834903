/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var quickstart;
(function (quickstart) {
    class WordAnnotation {
        static main(args) {
            let form = new quickstart.HTMLFormElementBuilder().action(WordAnnotation.SERVLET_URL).method().build();
            let labelInizio = new quickstart.HTMLLabelElementBuilder().textContent("2. Data la seguente definizione,prova a indovinare il termine definito").build();
            let divInizio = new quickstart.HTMLDivElementBuilder().build();
            $(divInizio).append(labelInizio);
            let labelDescrizione = new quickstart.HTMLLabelElementBuilder().textContent("Frase da mettere").build();
            let divLabelDescrizione = new quickstart.HTMLDivElementBuilder().build();
            $(divLabelDescrizione).append(labelDescrizione);
            let casellaIndovina = new quickstart.HTMLTextAreaElementBuilder().className("form-control").name("traduzione").placeholder("Scrivi la traduzione qui...").build();
            let divIndovina = new quickstart.HTMLDivElementBuilder().build();
            $(divIndovina).append(casellaIndovina);
            let bottoneNext = new quickstart.HTMLInputElementBuilder().type("submit").className("btn btn-primary").name("Next").value("Next").build();
            let bottoneSkip = new quickstart.HTMLInputElementBuilder().type("submit").name("Skip").className("btn btn-primary").value("Skip").build();
            let divButtons = new quickstart.HTMLDivElementBuilder().className("form-group").build();
            $(divButtons).append(bottoneNext).append(bottoneSkip);
            let labelLogout = new quickstart.HTMLLabelElementBuilder().textContent("Se vuoi effettuare il Logout ").build();
            let logout = new quickstart.HTMLAnchorElementBuilder().href(WordAnnotation.LOGOUT_URL).textContent(" Clicca qui").build();
            let linkHome = new quickstart.HTMLAnchorElementBuilder().href(WordAnnotation.HOME_URL).textContent("Home").build();
            let divLabelLogout = new quickstart.HTMLDivElementBuilder().build();
            $(divLabelLogout).append(labelLogout).append(logout).append(linkHome);
            $(form).append(divInizio);
            $(form).append(divLabelDescrizione);
            $(form).append(divIndovina);
            $(form).append(divButtons);
            $(form).append(divLabelLogout);
            $("body").append(form);
            $(linkHome).css("float", "right");
            $(casellaIndovina).width(1090);
            $(bottoneNext).width(200);
            $(bottoneSkip).width(200);
            $(bottoneNext).css("margin", "2% 0%");
            $(bottoneSkip).css("margin", "2% 0%");
            $(bottoneSkip).css("float", "right");
            $(form).css("margin", "1% 1.5%");
            $(labelLogout).css("color", "white");
            $(labelDescrizione).css("color", "white");
            $(labelInizio).css("color", "white");
            $("body").css("background-image", "url(https://media.giphy.com/media/TtTLEPsb3PvQQ/giphy.gif)");
            $.getJSON(WordAnnotation.REST_URL, "task=WORD_ANNOTATION", ((labelDescrizione) => {
                return (result, a, ctx) => {
                    let json = result;
                    let sDescription = (json["description"]);
                    $(labelDescrizione).text(sDescription);
                    return null;
                };
            })(labelDescrizione));
            $.getJSON(WordAnnotation.AUTHENTICATION_URL, (result, a, ctx) => {
                let json = result;
                let sLogin = (json["isLoggedIn"]);
                if (((o1, o2) => { if (o1 && o1.equals) {
                    return o1.equals(o2);
                }
                else {
                    return o1 === o2;
                } })(sLogin, "false"))
                    window.location.href = WordAnnotation.LOGIN_URL;
                return null;
            });
        }
    }
    WordAnnotation.SERVLET_URL = "wordAnnotation.jsp";
    WordAnnotation.REST_URL = "nextExample.jsp";
    WordAnnotation.AUTHENTICATION_URL = "isLoggedIn.jsp";
    WordAnnotation.LOGIN_URL = "login.html";
    WordAnnotation.HOME_URL = "home.html";
    WordAnnotation.LOGOUT_URL = "logout.jsp";
    quickstart.WordAnnotation = WordAnnotation;
    WordAnnotation["__class"] = "quickstart.WordAnnotation";
})(quickstart || (quickstart = {}));
quickstart.WordAnnotation.main(null);
