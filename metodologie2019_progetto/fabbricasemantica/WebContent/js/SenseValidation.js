/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var quickstart;
(function (quickstart) {
    class SenseValidation {
        static main(args) {
            let form = new quickstart.HTMLFormElementBuilder().action(SenseValidation.SERVLET_URL).method().build();
            let labelInizio = new quickstart.HTMLLabelElementBuilder().textContent("6. Data una parola e una frase in cui appare scegliere se ha senso oppure no").build();
            let divInizio = new quickstart.HTMLDivElementBuilder().build();
            $(divInizio).append(labelInizio);
            let labelParola = new quickstart.HTMLLabelElementBuilder().textContent("Frase da mettere").build();
            let divLabelParola = new quickstart.HTMLDivElementBuilder().build();
            $(divLabelParola).append(labelParola);
            let labelEsempio = new quickstart.HTMLLabelElementBuilder().textContent("Frase da mettere").build();
            let divLabelEsempio = new quickstart.HTMLDivElementBuilder().build();
            $(divLabelEsempio).append(labelEsempio);
            let labelSense = new quickstart.HTMLLabelElementBuilder().textContent("Sense da mettere").build();
            let divLabelSense = new quickstart.HTMLDivElementBuilder().build();
            $(divLabelSense).append(labelSense);
            let labelSi = new quickstart.HTMLLabelElementBuilder().textContent("Si").build();
            let radioButtonsSi = new quickstart.HTMLInputElementBuilder().type("radio").name("radioSi").value("Si").build();
            let divRadioButtons1 = new quickstart.HTMLDivElementBuilder().className("form-group").build();
            $(divRadioButtons1).append(radioButtonsSi).append(labelSi);
            let labelNo = new quickstart.HTMLLabelElementBuilder().textContent("No").build();
            let radioButtonsNo = new quickstart.HTMLInputElementBuilder().type("radio").name("radioNo").value("No").build();
            let divRadioButtons2 = new quickstart.HTMLDivElementBuilder().className("form-group").build();
            $(divRadioButtons2).append(radioButtonsNo).append(labelNo);
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
            $(form).append(divLabelEsempio);
            $(form).append(divLabelSense);
            $(form).append(divRadioButtons1);
            $(form).append(divRadioButtons2);
            $(form).append(divButtons);
            $(form).append(divLabelLogout);
            $("body").append(form);
            $(linkHome).css("float", "right");
            $(bottoneNext).width(200);
            $(bottoneSkip).width(200);
            $(bottoneSkip).css("float", "right");
            $(bottoneNext).css("margin", "2% 0%");
            $(bottoneSkip).css("margin", "2% 0%");
            $(form).css("margin", "1% 1.5%");
            $(labelLogout).css("color", "white");
            $(labelParola).css("color", "white");
            $(labelEsempio).css("color", "white");
            $(labelSense).css("color", "white");
            $(labelSi).css("color", "white");
            $(labelNo).css("color", "white");
            $(labelInizio).css("color", "white");
            $("body").css("background-image", "url(https://media.giphy.com/media/TtTLEPsb3PvQQ/giphy.gif)");
            $.getJSON(SenseValidation.REST_URL, "task=SENSE_VALIDATION", ((labelSense, labelParola, labelEsempio) => {
                return (result, a, ctx) => {
                    let json = result;
                    let sWord = (json["word"]);
                    let sExample = (json["example"]);
                    let sSense = (json["sense"]);
                    $(labelParola).text(sWord);
                    $(labelEsempio).text(sExample);
                    $(labelSense).text(sSense);
                    return null;
                };
            })(labelSense, labelParola, labelEsempio));
            $.getJSON(SenseValidation.AUTHENTICATION_URL, (result, a, ctx) => {
                let json = result;
                let sLogin = (json["isLoggedIn"]);
                if (((o1, o2) => { if (o1 && o1.equals) {
                    return o1.equals(o2);
                }
                else {
                    return o1 === o2;
                } })(sLogin, "false"))
                    window.location.href = SenseValidation.LOGIN_URL;
                return null;
            });
        }
    }
    SenseValidation.SERVLET_URL = "senseValidation.jsp";
    SenseValidation.REST_URL = "nextExample.jsp";
    SenseValidation.AUTHENTICATION_URL = "isLoggedIn.jsp";
    SenseValidation.LOGIN_URL = "login.html";
    quickstart.SenseValidation = SenseValidation;
    SenseValidation["__class"] = "quickstart.SenseValidation";
})(quickstart || (quickstart = {}));
quickstart.SenseValidation.main(null);
