/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

sap.ui.define([
    "sap/ui/core/mvc/Controller"
], function (Controller) {
    "use strict";

    return Controller.extend("sap.ui.demo.wt.controller.App", {

        onShowHello: function () {
            // show a native JavaScript alert
            alert("Hello World");
        }
    });
});
