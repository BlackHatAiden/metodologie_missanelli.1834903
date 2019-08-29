/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var quickstart;
(function (quickstart) {
    class HTMLTextAreaElementBuilder {
        constructor() {
            /*private*/ this.textArea = document.createElement("textarea");
        }
        /**
         * il metodo imposta il parametro name basandosi su una stringa
         * @param {string} name stringa
         * @return {quickstart.HTMLTextAreaElementBuilder} this
         */
        name(name) {
            this.textArea.name = name;
            return this;
        }
        /**
         * il metodo imposta il className prendendo in input una stringa
         * @param {string} s stringa
         * @return {quickstart.HTMLTextAreaElementBuilder} this
         */
        className(s) {
            this.textArea.className = s;
            return this;
        }
        /**
         * il metodo imposta il parametro placeHolder quindi la stringa da visualizzare nella
         * casella vuota
         * @param {string} s stringa
         * @return {quickstart.HTMLTextAreaElementBuilder} this
         */
        placeholder(s) {
            this.textArea.placeholder = s;
            return this;
        }
        /**
         * il metodo costruisce l'ogetto con le impostazioni volute
         * @return {HTMLTextAreaElement} textArea
         */
        build() {
            return this.textArea;
        }
    }
    quickstart.HTMLTextAreaElementBuilder = HTMLTextAreaElementBuilder;
    HTMLTextAreaElementBuilder["__class"] = "quickstart.HTMLTextAreaElementBuilder";
})(quickstart || (quickstart = {}));
