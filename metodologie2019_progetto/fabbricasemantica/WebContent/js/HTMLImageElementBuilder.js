/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var quickstart;
(function (quickstart) {
    class HTMLImageElementBuilder {
        constructor() {
            /*private*/ this.img = document.createElement("img");
        }
        /**
         * il metodo preso in input una stringa imposta il percorso dell'immagine
         * @param {string} s
         * @return
         * @return {quickstart.HTMLImageElementBuilder}
         */
        src(s) {
            this.img.src = s;
            return this;
        }
        /**
         * il metodo prese in input 2 stringhe imposta gli attributi
         * @param {string} value
         * @param {string} name
         * @return
         * @return {quickstart.HTMLImageElementBuilder}
         */
        setAttribute(name, value) {
            this.img.setAttribute(name, value);
            return this;
        }
        /**
         * il metodo costruisce l'ogetto con le impostazioni volute
         * @return {HTMLImageElement} link
         */
        build() {
            return this.img;
        }
        static main(args) {
        }
    }
    quickstart.HTMLImageElementBuilder = HTMLImageElementBuilder;
    HTMLImageElementBuilder["__class"] = "quickstart.HTMLImageElementBuilder";
})(quickstart || (quickstart = {}));
quickstart.HTMLImageElementBuilder.main(null);
