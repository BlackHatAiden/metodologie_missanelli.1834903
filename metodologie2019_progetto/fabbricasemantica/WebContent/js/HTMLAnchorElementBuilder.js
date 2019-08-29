/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var quickstart;
(function (quickstart) {
    class HTMLAnchorElementBuilder {
        constructor() {
            /*private*/ this.link = document.createElement("a");
        }
        /**
         * il metodo preso in input una stringa imposta il contenuto testuale del link
         * @param {string} s stringa
         * @return {quickstart.HTMLAnchorElementBuilder} this
         */
        textContent(s) {
            this.link.textContent = s;
            return this;
        }
        /**
         * il metodo setta la funzione una volta cliccato su esso
         * @param {*} f funzione
         * @return {quickstart.HTMLAnchorElementBuilder} this
         */
        onclick(f) {
            this.link.onclick = (f);
            return this;
        }
        /**
         * il metodo presa in input una stringa imposta il collegamento del link
         * @param {string} s stringa
         * @return {quickstart.HTMLAnchorElementBuilder} this
         */
        href(s) {
            this.link.href = s;
            return this;
        }
        /**
         * il metodo costruisce l'ogetto con le impostazioni volute
         * @return {HTMLAnchorElement} link
         */
        build() {
            return this.link;
        }
    }
    quickstart.HTMLAnchorElementBuilder = HTMLAnchorElementBuilder;
    HTMLAnchorElementBuilder["__class"] = "quickstart.HTMLAnchorElementBuilder";
})(quickstart || (quickstart = {}));
