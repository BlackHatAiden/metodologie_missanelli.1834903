/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var quickstart;
(function (quickstart) {
    class SenseAnnotation {
        static main(args) {
            let form = new quickstart.HTMLFormElementBuilder().action(SenseAnnotation.SERVLET_URL).method().build();
            let labelInizio = new quickstart.HTMLLabelElementBuilder().textContent("4. Selezione il significato pi\u00f9 corretto della parola nelle seguenti frasi").build();
            let divInizio = new quickstart.HTMLDivElementBuilder().build();
            $(divInizio).append(labelInizio);
            let labelParola = new quickstart.HTMLLabelElementBuilder().textContent("Frase da mettere").build();
            let divLabelParola = new quickstart.HTMLDivElementBuilder().build();
            $(divLabelParola).append(labelParola);
            let labelDescrizione = new quickstart.HTMLLabelElementBuilder().textContent("Frase da mettere").build();
            let divLabelDescrizione = new quickstart.HTMLDivElementBuilder().build();
            $(divLabelDescrizione).append(labelDescrizione);
            let check1 = new quickstart.HTMLInputElementBuilder().type("checkbox").name("frase1").build();
            let labelCheck1 = new quickstart.HTMLLabelElementBuilder().textContent("  aaa").build();
            let divCheck1 = new quickstart.HTMLDivElementBuilder().className("form-group").build();
            $(divCheck1).append(check1).append(labelCheck1);
            let check2 = new quickstart.HTMLInputElementBuilder().type("checkbox").name("frase2").build();
            let labelCheck2 = new quickstart.HTMLLabelElementBuilder().textContent("  bbb").build();
            let divCheck2 = new quickstart.HTMLDivElementBuilder().className("form-group").build();
            $(divCheck2).append(check2).append(labelCheck2);
            let check3 = new quickstart.HTMLInputElementBuilder().type("checkbox").name("frase3").build();
            let labelCheck3 = new quickstart.HTMLLabelElementBuilder().textContent("  ccc").build();
            let divCheck3 = new quickstart.HTMLDivElementBuilder().className("form-group").build();
            $(divCheck3).append(check3).append(labelCheck3);
            let check4 = new quickstart.HTMLInputElementBuilder().type("checkbox").name("frase4").build();
            let labelCheck4 = new quickstart.HTMLLabelElementBuilder().textContent("  ddd").build();
            let divCheck4 = new quickstart.HTMLDivElementBuilder().className("form-group").build();
            $(divCheck4).append(check4).append(labelCheck4);
            let bottoneNext = new quickstart.HTMLInputElementBuilder().type("submit").className("btn btn-primary").name("Next").value("Next").src("senseAnnotation").build();
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
            $(form).append(divCheck1);
            $(form).append(divCheck2);
            $(form).append(divCheck3);
            $(form).append(divCheck4);
            $(form).append(divButtons);
            $(form).append(divLabelLogout);
            $("body").append(form);
            $(linkHome).css("float", "right");
            $(bottoneNext).width(200);
            $(bottoneSkip).width(200);
            $(bottoneNext).css("margin", "2% 0%");
            $(bottoneSkip).css("margin", "2% 0%");
            $(bottoneSkip).css("float", "right");
            $(form).css("margin", "1% 1.5%");
            $(labelLogout).css("color", "white");
            $(labelParola).css("color", "white");
            $(labelDescrizione).css("color", "white");
            $(labelCheck1).css("color", "white");
            $(labelCheck2).css("color", "white");
            $(labelCheck3).css("color", "white");
            $(labelCheck4).css("color", "white");
            $(labelInizio).css("color", "white");
            $("body").css("background-image", "url(https://media.giphy.com/media/TtTLEPsb3PvQQ/giphy.gif)");
            $.getJSON(SenseAnnotation.REST_URL, "task=SENSE_ANNOTATION", ((labelDescrizione, labelCheck3, labelCheck2, labelCheck1, labelCheck4, labelParola) => {
                return (result, a, ctx) => {
                    let json = result;
                    let sWord = (json["word"]);
                    let sDescription = (json["description"]);
                    let sSenses1 = (json["senses1"]);
                    let sSenses2 = (json["senses2"]);
                    let sSenses3 = (json["senses3"]);
                    let sSenses4 = (json["senses4"]);
                    $(labelParola).text(sWord);
                    $(labelDescrizione).text(sDescription);
                    $(labelCheck1).text(sSenses1);
                    $(labelCheck2).text(sSenses2);
                    $(labelCheck3).text(sSenses3);
                    $(labelCheck4).text(sSenses4);
                    return null;
                };
            })(labelDescrizione, labelCheck3, labelCheck2, labelCheck1, labelCheck4, labelParola));
            $.getJSON(SenseAnnotation.AUTHENTICATION_URL, (result, a, ctx) => {
                let json = result;
                let sLogin = (json["isLoggedIn"]);
                if (((o1, o2) => { if (o1 && o1.equals) {
                    return o1.equals(o2);
                }
                else {
                    return o1 === o2;
                } })(sLogin, "false"))
                    window.location.href = SenseAnnotation.LOGIN_URL;
                return null;
            });
        }
    }
    SenseAnnotation.SERVLET_URL = "senseAnnotation.jsp";
    SenseAnnotation.REST_URL = "nextExample.jsp";
    SenseAnnotation.AUTHENTICATION_URL = "isLoggedIn.jsp";
    SenseAnnotation.LOGIN_URL = "login.html";
    quickstart.SenseAnnotation = SenseAnnotation;
    SenseAnnotation["__class"] = "quickstart.SenseAnnotation";
})(quickstart || (quickstart = {}));
quickstart.SenseAnnotation.main(null);
