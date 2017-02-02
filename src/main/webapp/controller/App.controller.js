/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

sap.ui.define([
    "sap/ui/core/mvc/Controller",
    "sap/m/MessageToast"
    ], function (Controller, MessageToast) {
    "use strict";

    return Controller.extend("sap.ui.demo.wt.controller.App", {

        


        onShowHello: function () {
            // show a native JavaScript alert
            //alert("Hello World");
            // read msg from i18n model
            var oBundle = this.getView().getModel("i18n").getResourceBundle();
            var sRecipient = this.getView().getModel().getProperty("/recipient/name");
            var sMsg = oBundle.getText("helloMsg", [sRecipient]);
            // show message
            MessageToast.show(sMsg);
        },
        
        onShowHello1: function () {
            // show a native JavaScript alert
            //alert("Hello World");
             MessageToast.show("Hello World1");
        }
    });
});
