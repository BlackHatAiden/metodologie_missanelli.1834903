/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var quickstart;
(function (quickstart) {
    class HTMLLabelElementBuilder {
        constructor() {
            /*private*/ this.label = document.createElement("label");
        }
        /**
         * il metodo imposta il testo della label
         * @param {string} s stringa
         * @return {quickstart.HTMLLabelElementBuilder} this
         */
        textContent(s) {
            this.label.textContent = s;
            return this;
        }
        /**
         * il metodo  aggiunge paramnetro className impostandolo attraverso la stringa
         * @param {string} s stringa
         * @return {quickstart.HTMLLabelElementBuilder} this
         */
        className(s) {
            this.label.className = s;
            return this;
        }
        /**
         * il metodo imposta il setAttribut basandosi su due stringhe tipo e valore
         * @param {string} name tipo
         * @param {string} value valore
         * @return {quickstart.HTMLLabelElementBuilder} this
         */
        setAttribute(name, value) {
            this.label.setAttribute(name, value);
            return this;
        }
        /**
         * il metodo costruisce l'ogetto con le impostazioni volute
         * @return {HTMLLabelElement} label
         */
        build() {
            return this.label;
        }
    }
    quickstart.HTMLLabelElementBuilder = HTMLLabelElementBuilder;
    HTMLLabelElementBuilder["__class"] = "quickstart.HTMLLabelElementBuilder";
})(quickstart || (quickstart = {}));
