/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var quickstart;
(function (quickstart) {
    class TranslationAnnotation {
        static main(args) {
            let form = new quickstart.HTMLFormElementBuilder().action(TranslationAnnotation.SERVLET_URL).method().build();
            let labelInizio = new quickstart.HTMLLabelElementBuilder().textContent("1. Data la seguente parola e definizione,fornire una traduzione").build();
            let divInizio = new quickstart.HTMLDivElementBuilder().build();
            $(divInizio).append(labelInizio);
            let labelParola = new quickstart.HTMLLabelElementBuilder().textContent("Parola da mettere").build();
            let divLabelParola = new quickstart.HTMLDivElementBuilder().build();
            $(divLabelParola).append(labelParola);
            let labelDescrizione = new quickstart.HTMLLabelElementBuilder().textContent("Definizione da mettere").build();
            let divLabelDescrizione = new quickstart.HTMLDivElementBuilder().build();
            $(divLabelDescrizione).append(labelDescrizione);
            let casellaTraduzione = new quickstart.HTMLTextAreaElementBuilder().className("form-control").name("traduzione").placeholder("Scrivi la traduzione qui...").build();
            let divTraduzione = new quickstart.HTMLDivElementBuilder().build();
            $(divTraduzione).append(casellaTraduzione);
            let bottoneNext = new quickstart.HTMLInputElementBuilder().type("submit").className("btn btn-primary").name("Next").value("Next").build();
            let divButtons = new quickstart.HTMLDivElementBuilder().className("form-group").build();
            let bottoneSkip = new quickstart.HTMLInputElementBuilder().type("submit").name("Skip").className("btn btn-primary").value("Skip").build();
            $(divButtons).append(bottoneNext).append(bottoneSkip);
            let labelLogout = new quickstart.HTMLLabelElementBuilder().textContent("Se vuoi effettuare il Logout ").build();
            let logout = new quickstart.HTMLAnchorElementBuilder().href("logout.jsp").textContent(" Clicca qui").build();
            let linkHome = new quickstart.HTMLAnchorElementBuilder().href("home.html").textContent("Home").build();
            let divLabelLogout = new quickstart.HTMLDivElementBuilder().build();
            $(divLabelLogout).append(labelLogout).append(logout).append(linkHome);
            $(form).append(divInizio);
            $(form).append(divLabelParola);
            $(form).append(divLabelDescrizione);
            $(form).append(divTraduzione);
            $(form).append(divButtons);
            $(form).append(divLabelLogout);
            $("body").append(form);
            $(linkHome).css("float", "right");
            $(casellaTraduzione).width(1090);
            $(bottoneNext).width(200);
            $(bottoneSkip).width(200);
            $(bottoneNext).css("margin", "2% 0%");
            $(bottoneSkip).css("margin", "2% 0%");
            $(bottoneSkip).css("float", "right");
            $(form).css("margin", "1% 1.5%");
            $(labelLogout).css("color", "white");
            $(labelParola).css("color", "white");
            $(labelDescrizione).css("color", "white");
            $(labelInizio).css("color", "white");
            $("body").css("background-image", "url(https://media.giphy.com/media/TtTLEPsb3PvQQ/giphy.gif)");
            $.getJSON(TranslationAnnotation.REST_URL, "task=TRANSLATION_ANNOTATION", ((labelDescrizione, labelParola) => {
                return (result, a, ctx) => {
                    let json = result;
                    let sWord = (json["word"]);
                    let sDescription = (json["description"]);
                    $(labelParola).text(sWord);
                    $(labelDescrizione).text(sDescription);
                    return null;
                };
            })(labelDescrizione, labelParola));
            $.getJSON(TranslationAnnotation.AUTHENTICATION_URL, (result, a, ctx) => {
                let json = result;
                let sLogin = (json["isLoggedIn"]);
                if (((o1, o2) => { if (o1 && o1.equals) {
                    return o1.equals(o2);
                }
                else {
                    return o1 === o2;
                } })(sLogin, "false"))
                    window.location.href = TranslationAnnotation.LOGIN_URL;
                return null;
            });
        }
    }
    TranslationAnnotation.SERVLET_URL = "translationAnnotation.jsp";
    TranslationAnnotation.REST_URL = "nextExample.jsp";
    TranslationAnnotation.AUTHENTICATION_URL = "isLoggedIn.jsp";
    TranslationAnnotation.LOGIN_URL = "login.html";
    quickstart.TranslationAnnotation = TranslationAnnotation;
    TranslationAnnotation["__class"] = "quickstart.TranslationAnnotation";
})(quickstart || (quickstart = {}));
quickstart.TranslationAnnotation.main(null);
