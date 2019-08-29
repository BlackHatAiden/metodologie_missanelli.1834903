/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var quickstart;
(function (quickstart) {
    class Signup {
        static main(args) {
            let form = new quickstart.HTMLFormElementBuilder().action(Signup.SERVLET_URL).method().build();
            let labelInizio = new quickstart.HTMLLabelElementBuilder().textContent("Iscriviti a FabbricaSemantica").build();
            let divInizio = new quickstart.HTMLDivElementBuilder().build();
            $(divInizio).append(labelInizio);
            let labelEmail = new quickstart.HTMLLabelElementBuilder().textContent("Email:").build();
            let divLabelEmail = new quickstart.HTMLDivElementBuilder().build();
            $(divLabelEmail).append(labelEmail);
            let casellaEmail = new quickstart.HTMLInputElementBuilder().type("Email").name("email").placeholder("Inserire Email").build();
            let divEmail = new quickstart.HTMLDivElementBuilder().build();
            $(divEmail).append(casellaEmail);
            let labelPassword = new quickstart.HTMLLabelElementBuilder().textContent("Password:").build();
            let divLabelPas = new quickstart.HTMLDivElementBuilder().build();
            $(divLabelPas).append(labelPassword);
            let casellaPassword = new quickstart.HTMLInputElementBuilder().type("Password").name("password").placeholder("Inserire Password").build();
            let divPas = new quickstart.HTMLDivElementBuilder().build();
            $(divPas).append(casellaPassword);
            let labelPassword2 = new quickstart.HTMLLabelElementBuilder().textContent("Password:").build();
            let divLabelPas2 = new quickstart.HTMLDivElementBuilder().build();
            $(divLabelPas2).append(labelPassword2);
            let casellaPassword2 = new quickstart.HTMLInputElementBuilder().type("Password").name("password2").placeholder("Inserire Password").build();
            let divPas2 = new quickstart.HTMLDivElementBuilder().build();
            $(divPas2).append(casellaPassword2);
            let labelMadreLingua = new quickstart.HTMLLabelElementBuilder().textContent("Selezionare il livello della tua lingua ").build();
            let divMadreLingua = new quickstart.HTMLDivElementBuilder().build();
            $(divMadreLingua).append(labelMadreLingua);
            let labelItaliano = new quickstart.HTMLLabelElementBuilder().textContent("Italiano").build();
            let checkBoxIta = new quickstart.HTMLInputElementBuilder().type("checkbox").name("checkBoxIta").build();
            let M = new quickstart.HTMLOptionElementBuilder().text("Madrelingua").build();
            let A1 = new quickstart.HTMLOptionElementBuilder().text("A1").build();
            let A2 = new quickstart.HTMLOptionElementBuilder().text("A2").build();
            let B1 = new quickstart.HTMLOptionElementBuilder().text("B1").build();
            let B2 = new quickstart.HTMLOptionElementBuilder().text("B2").build();
            let C1 = new quickstart.HTMLOptionElementBuilder().text("C1").build();
            let C2 = new quickstart.HTMLOptionElementBuilder().text("C2").build();
            let levelIta = new quickstart.HTMLSelectElementBuilder().name("levelIta").build();
            $(levelIta).append(M, A1, A2, B1, B2, C1, C2);
            let divLingua = new quickstart.HTMLDivElementBuilder().className("form-group").build();
            $(divLingua).append(checkBoxIta).append(labelItaliano).append(levelIta);
            let labelInglese = new quickstart.HTMLLabelElementBuilder().textContent("Inglese").build();
            let checkBoxEng = new quickstart.HTMLInputElementBuilder().type("checkbox").name("checkBoxEng").build();
            let MM = new quickstart.HTMLOptionElementBuilder().text("Madrelingua").build();
            let A11 = new quickstart.HTMLOptionElementBuilder().text("A1").build();
            let A22 = new quickstart.HTMLOptionElementBuilder().text("A2").build();
            let B11 = new quickstart.HTMLOptionElementBuilder().text("B1").build();
            let B22 = new quickstart.HTMLOptionElementBuilder().text("B2").build();
            let C11 = new quickstart.HTMLOptionElementBuilder().text("C1").build();
            let C22 = new quickstart.HTMLOptionElementBuilder().text("C2").build();
            let levelEng = new quickstart.HTMLSelectElementBuilder().name("levelEng").build();
            $(levelEng).append(MM, A11, A22, B11, B22, C11, C22);
            let divLingua2 = new quickstart.HTMLDivElementBuilder().className("form-group").build();
            $(divLingua2).append(checkBoxEng).append(labelInglese).append(levelEng);
            let bottoneSignup = new quickstart.HTMLInputElementBuilder().type("submit").name("Signup").className("btn btn-primary").value("Signup").src("signup.jsp").build();
            let divButtons = new quickstart.HTMLDivElementBuilder().className("form-group").build();
            $(divButtons).append(bottoneSignup);
            let labelLogin = new quickstart.HTMLLabelElementBuilder().build();
            labelLogin.textContent = "Sei gi\u00e0 registrato ? ";
            let link = new quickstart.HTMLAnchorElementBuilder().textContent(" Accedi a Fabbricasemantica").href("login.html").build();
            let divLink = new quickstart.HTMLDivElementBuilder().className("form-group").build();
            $(divLink).append(labelLogin).append(link);
            $(form).append(divInizio);
            $(form).append(divLabelEmail);
            $(form).append(divEmail);
            $(form).append(divLabelPas);
            $(form).append(divPas);
            $(form).append(divLabelPas2);
            $(form).append(divPas2);
            $(form).append(divMadreLingua);
            $(form).append(divLingua);
            $(form).append(divLingua2);
            $(form).append(divButtons);
            $(form).append(divLink);
            $("body").append(form);
            $(labelInizio).css("font-size", "200%");
            $(labelInizio).css(" font-weight", "bolder");
            $(labelMadreLingua).css("margin", "2% 0%");
            $(casellaEmail).width(300);
            $(casellaPassword).width(300);
            $(casellaPassword2).width(300);
            $(labelItaliano).css("margin", "0% 2.5%");
            $(labelInglese).css("margin", "0% 2.5%");
            $(bottoneSignup).width(300);
            $(bottoneSignup).css("margin", "2% 0%");
            $(labelInizio).css("color", "white");
            $(labelEmail).css("color", "white");
            $(labelPassword).css("color", "white");
            $(labelLogin).css("color", "white");
            $(labelPassword2).css("color", "white");
            $(labelInglese).css("color", "white");
            $(labelItaliano).css("color", "white");
            $(labelMadreLingua).css("color", "white");
            $("body").css("background-image", "url(https://media.giphy.com/media/TtTLEPsb3PvQQ/giphy.gif)");
            $(form).css("margin", "0% 1.5%");
        }
    }
    Signup.SERVLET_URL = "signup.jsp";
    quickstart.Signup = Signup;
    Signup["__class"] = "quickstart.Signup";
})(quickstart || (quickstart = {}));
quickstart.Signup.main(null);