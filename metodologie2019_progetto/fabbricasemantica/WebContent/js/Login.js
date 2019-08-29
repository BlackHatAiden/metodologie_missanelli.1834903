/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var quickstart;
(function (quickstart) {
    class Login {
        static main(args) {
            let form = new quickstart.HTMLFormElementBuilder().action(Login.SERVLET_URL).method().build();
            let labelInizio = new quickstart.HTMLLabelElementBuilder().textContent("Accedi a FabbricaSemantica").build();
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
            let bottoneLogin = new quickstart.HTMLInputElementBuilder().type("submit").name("login").className("btn btn-primary").value("login").build();
            let divButtons = new quickstart.HTMLDivElementBuilder().className("form-group").build();
            $(divButtons).append(bottoneLogin);
            let labelSignup = new quickstart.HTMLLabelElementBuilder().textContent("Nuovo su FabbricaSemantica ? ").build();
            let link = new quickstart.HTMLAnchorElementBuilder().textContent(" Crea un Account.").href("signup.html").build();
            let divSignup = new quickstart.HTMLDivElementBuilder().build();
            $(divSignup).append(labelSignup).append(link);
            $(form).append(divInizio);
            $(form).append(divLabelEmail);
            $(form).append(divEmail);
            $(form).append(divLabelPas);
            $(form).append(divPas);
            $(form).append(divButtons);
            $(form).append(divSignup);
            $("body").append(form);
            $(labelInizio).css("font-size", "200%");
            $(labelInizio).css(" font-weight", "bolder");
            $(labelInizio).css("margin", "7%");
            $(bottoneLogin).css("margin", "1% 0%");
            $(bottoneLogin).width(300);
            $(casellaEmail).width(300);
            $(casellaPassword).width(300);
            $(labelInizio).css("color", "white");
            $(labelEmail).css("color", "white");
            $(labelPassword).css("color", "white");
            $(labelSignup).css("color", "white");
            $("body").css("background-image", "url(https://media.giphy.com/media/TtTLEPsb3PvQQ/giphy.gif)");
            $(form).css("margin", "5% 40%");
        }
    }
    Login.SERVLET_URL = "login.jsp";
    quickstart.Login = Login;
    Login["__class"] = "quickstart.Login";
})(quickstart || (quickstart = {}));
quickstart.Login.main(null);
