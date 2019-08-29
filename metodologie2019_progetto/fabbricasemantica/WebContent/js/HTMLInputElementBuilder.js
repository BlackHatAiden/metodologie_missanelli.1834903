/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var quickstart;
(function (quickstart) {
    class HTMLInputElementBuilder {
        constructor() {
            /*private*/ this.input = document.createElement("input");
        }
        /**
         * il metodo imposta il tipo dell'elemento sotto forma di stringa
         * @param {string} s stringa
         * @return {quickstart.HTMLInputElementBuilder} this
         */
        type(s) {
            this.input.type = s;
            return this;
        }
        /**
         * il metodo presa in input una stringa imposta il percorso
         * @param {string} s stringa
         * @return {quickstart.HTMLInputElementBuilder} this
         */
        src(s) {
            this.input.src = s;
            return this;
        }
        /**
         * il metodo imposta il nome dell'elemento
         * @param {string} s stringa
         * @return {quickstart.HTMLInputElementBuilder} this
         */
        name(s) {
            this.input.name = s;
            return this;
        }
        /**
         * il metodo imposta il testo dell'elemento
         * @param {string} s stringa
         * @return {quickstart.HTMLInputElementBuilder} this
         */
        textContent(s) {
            this.input.textContent = s;
            return this;
        }
        /**
         * il metodo presa in input una stringa imposta il testo della casella vuota
         * @param {string} s stringa
         * @return {quickstart.HTMLInputElementBuilder} this
         */
        placeholder(s) {
            this.input.placeholder = s;
            return this;
        }
        /**
         * il metodo presa in input una stringa imposta il className
         * @param {string} s stringa
         * @return {quickstart.HTMLInputElementBuilder} this
         */
        className(s) {
            this.input.className = s;
            return this;
        }
        /**
         * il metodo imposta il valore dell'elemento
         * @param {string} s stringa
         * @return {quickstart.HTMLInputElementBuilder} this
         */
        value(s) {
            this.input.value = s;
            return this;
        }
        /**
         * il metodo costruisce l'ogetto con le impostazioni volute
         * @return {HTMLInputElement} input
         */
        build() {
            return this.input;
        }
    }
    quickstart.HTMLInputElementBuilder = HTMLInputElementBuilder;
    HTMLInputElementBuilder["__class"] = "quickstart.HTMLInputElementBuilder";
})(quickstart || (quickstart = {}));
