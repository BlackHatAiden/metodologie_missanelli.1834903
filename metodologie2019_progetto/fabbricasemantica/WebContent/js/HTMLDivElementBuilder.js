/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var quickstart;
(function (quickstart) {
    class HTMLDivElementBuilder {
        constructor() {
            /*private*/ this.div = document.createElement("div");
        }
        /**
         * il metodo imposta il className prendendo in input una stringa
         * @param {string} s stringa
         * @return {quickstart.HTMLDivElementBuilder} this
         */
        className(s) {
            this.div.className = s;
            return this;
        }
        /**
         * il metodo costruisce l'ogetto con le impostazioni volute
         * @return {HTMLDivElement} div
         */
        build() {
            return this.div;
        }
    }
    quickstart.HTMLDivElementBuilder = HTMLDivElementBuilder;
    HTMLDivElementBuilder["__class"] = "quickstart.HTMLDivElementBuilder";
})(quickstart || (quickstart = {}));
