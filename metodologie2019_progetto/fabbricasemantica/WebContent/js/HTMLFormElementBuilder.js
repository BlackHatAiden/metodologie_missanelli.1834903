/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var quickstart;
(function (quickstart) {
    class HTMLFormElementBuilder {
        constructor() {
            /*private*/ this.form = document.createElement("form");
        }
        /**
         * il metodo imposta il contenuto testuale da visualizzare
         * @param {string} s stringa
         * @return {quickstart.HTMLFormElementBuilder} this
         */
        textContent(s) {
            this.form.textContent = s;
            return this;
        }
        /**
         * il metodo permette di impostare a quale URL inviare i dati
         * @param {string} s stringa
         * @return {quickstart.HTMLFormElementBuilder} this
         */
        action(s) {
            this.form.action = s;
            return this;
        }
        /**
         * il metodo se serve viene impostato di default a POST
         * @param s stringa
         * @return {quickstart.HTMLFormElementBuilder} this
         */
        method() {
            this.form.method = "POST";
            return this;
        }
        /**
         * il metodo costruisce l'ogetto con le impostazioni volute
         * @return {HTMLFormElement} form
         */
        build() {
            return this.form;
        }
    }
    quickstart.HTMLFormElementBuilder = HTMLFormElementBuilder;
    HTMLFormElementBuilder["__class"] = "quickstart.HTMLFormElementBuilder";
})(quickstart || (quickstart = {}));
