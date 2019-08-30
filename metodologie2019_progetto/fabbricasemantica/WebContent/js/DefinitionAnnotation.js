/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var quickstart;
(function (quickstart) {
    class DefinitionAnnotation {
        static main(args) {
            let form = new quickstart.HTMLFormElementBuilder().action(DefinitionAnnotation.SERVLET_URL).method().build();
            let labelInizio = new quickstart.HTMLLabelElementBuilder().textContent("3. Data la seguente parola e suo iperonimo,fornire una definizione").build();
            let divInizio = new quickstart.HTMLDivElementBuilder().build();
            $(divInizio).append(labelInizio);
            let labelParola = new quickstart.HTMLLabelElementBuilder().textContent("Parola ").build();
            let divLabelParola = new quickstart.HTMLDivElementBuilder().build();
            $(divLabelParola).append(labelParola);
            let labelHype = new quickstart.HTMLLabelElementBuilder().textContent("iperonomio").build();
            let divLabelHype = new quickstart.HTMLDivElementBuilder().build();
            $(divLabelHype).append(labelHype);
            let casellaDefinizione = new quickstart.HTMLTextAreaElementBuilder().className("form-control").name("traduzione").placeholder("Scrivi la traduzione qui...").build();
            let divDefinizione = new quickstart.HTMLDivElementBuilder().build();
            $(divDefinizione).append(casellaDefinizione);
            let bottoneNext = new quickstart.HTMLInputElementBuilder().type("submit").name("Next").className("btn btn-primary").value("Next").build();
            let bottoneSkip = new quickstart.HTMLInputElementBuilder().type("submit").name("Skip").className("btn btn-primary").value("Skip").build();
            let divButtons = new quickstart.HTMLDivElementBuilder().className("form-group").build();
            $(divButtons).append(bottoneNext).append(bottoneSkip);
            let labelLogout = new quickstart.HTMLLabelElementBuilder().textContent("Se vuoi effettuare il Logout ").build();
            let logout = new quickstart.HTMLAnchorElementBuilder().href(DefinitionAnnotation.LOGOUT_URL).textContent(" Clicca qui").build();
            let linkHome = new quickstart.HTMLAnchorElementBuilder().href(DefinitionAnnotation.HOME_URL).textContent("Home").build();
            let divLabelLogout = new quickstart.HTMLDivElementBuilder().build();
            $(divLabelLogout).append(labelLogout).append(logout).append(linkHome);
            $(form).append(divInizio);
            $(form).append(divLabelParola);
            $(form).append(divLabelHype);
            $(form).append(divDefinizione);
            $(form).append(divButtons);
            $(form).append(divLabelLogout);
            $("body").append(form);
            $(linkHome).css("float", "right");
            $(casellaDefinizione).width(1090);
            $(bottoneNext).width(200);
            $(bottoneSkip).width(200);
            $(bottoneNext).css("margin", "2% 0%");
            $(bottoneSkip).css("margin", "2% 0%");
            $(bottoneSkip).css("float", "right");
            $(form).css("margin", "1% 1.5%");
            $(labelLogout).css("color", "white");
            $(labelParola).css("color", "white");
            $(labelHype).css("color", "white");
            $(labelInizio).css("color", "white");
            $("body").css("background-image", "url(https://media.giphy.com/media/TtTLEPsb3PvQQ/giphy.gif)");
            $.getJSON(DefinitionAnnotation.REST_URL, "task=DEFINITION_ANNOTATION", ((labelHype, labelParola) => {
                return (result, a, ctx) => {
                    let json = result;
                    let sWord = (json["word"]);
                    let sHypernym = (json["hypernym"]);
                    $(labelParola).text(sWord);
                    $(labelHype).text(sHypernym);
                    return null;
                };
            })(labelHype, labelParola));
            $.getJSON(DefinitionAnnotation.AUTHENTICATION_URL, (result, a, ctx) => {
                let json = result;
                let sLogin = (json["isLoggedIn"]);
                if (((o1, o2) => { if (o1 && o1.equals) {
                    return o1.equals(o2);
                }
                else {
                    return o1 === o2;
                } })(sLogin, "false"))
                    window.location.href = DefinitionAnnotation.LOGIN_URL;
                return null;
            });
        }
    }
    DefinitionAnnotation.SERVLET_URL = "definitionAnnotation.jsp";
    DefinitionAnnotation.REST_URL = "nextExample.jsp";
    DefinitionAnnotation.AUTHENTICATION_URL = "isLoggedIn.jsp";
    DefinitionAnnotation.LOGIN_URL = "login.html";
    DefinitionAnnotation.HOME_URL = "home.html";
    DefinitionAnnotation.LOGOUT_URL = "logout.jsp";
    quickstart.DefinitionAnnotation = DefinitionAnnotation;
    DefinitionAnnotation["__class"] = "quickstart.DefinitionAnnotation";
})(quickstart || (quickstart = {}));
quickstart.DefinitionAnnotation.main(null);
