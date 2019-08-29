/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var quickstart;
(function (quickstart) {
    class HTMLOptionElementBuilder {
        constructor() {
            /*private*/ this.option = document.createElement("option");
        }
        /**
         * il metodo preso in input una stringa imposta il testo dell'opzione
         * @param {string} s stringa
         * @return {quickstart.HTMLOptionElementBuilder} this
         */
        text(s) {
            this.option.text = s;
            return this;
        }
        /**
         * il metodo costruisce l'ogetto con le impostazioni volute
         * @return {HTMLOptionElement} option
         */
        build() {
            return this.option;
        }
    }
    quickstart.HTMLOptionElementBuilder = HTMLOptionElementBuilder;
    HTMLOptionElementBuilder["__class"] = "quickstart.HTMLOptionElementBuilder";
})(quickstart || (quickstart = {}));
