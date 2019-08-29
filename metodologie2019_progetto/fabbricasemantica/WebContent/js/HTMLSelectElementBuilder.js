/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var quickstart;
(function (quickstart) {
    class HTMLSelectElementBuilder {
        constructor() {
            /*private*/ this.select = document.createElement("select");
        }
        /**
         * il metodo imposta il nome della select
         * @param {string} s stringa
         * @return {quickstart.HTMLSelectElementBuilder} this
         */
        name(s) {
            this.select.name = s;
            return this;
        }
        /**
         * il metodo costruisce l'ogetto con le impostazioni volute
         * @return {HTMLSelectElement} select
         */
        build() {
            return this.select;
        }
    }
    quickstart.HTMLSelectElementBuilder = HTMLSelectElementBuilder;
    HTMLSelectElementBuilder["__class"] = "quickstart.HTMLSelectElementBuilder";
})(quickstart || (quickstart = {}));
