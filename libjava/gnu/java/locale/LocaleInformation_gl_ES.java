// This file was automatically generated by localedef.

package gnu.java.locale;

import java.util.ListResourceBundle;

public class LocaleInformation_gl_ES extends ListResourceBundle
{
  static final String decimalSeparator = ",";
  static final String groupingSeparator = "";
  static final String numberFormat = "#.###";
  static final String percentFormat = "#%";
  static final String[] weekdays = { null, "Domingo", "Luns", "Martes", "M\u00E9rcores", "Xoves", "Venres", "S\u00E1bado" };

  static final String[] shortWeekdays = { null, "Dom", "Lun", "Mar", "M\u00E9r", "Xov", "Ven", "S\u00E1b" };

  static final String[] shortMonths = { "Xan", "Feb", "Mar", "Abr", "Mai", "Xu\u00F1", "Xul", "Ago", "Set", "Out", "Nov", "Dec", null };

  static final String[] months = { "Xaneiro", "Febreiro", "Marzo", "Abril", "Maio", "Xu\u00F1o", "Xullo", "Agosto", "Setembro", "Outubro", "Novembro", "Decembro", null };

  static final String[] ampms = { "", "" };

  static final String shortDateFormat = "dd/MM/yy";
  static final String defaultTimeFormat = "";
  static final String currencySymbol = "Pta";
  static final String intlCurrencySymbol = "ESP";
  static final String currencyFormat = "$ #,###,##0.;-$ #,###,##0.";

  private static final Object[][] contents =
  {
    { "weekdays", weekdays },
    { "shortWeekdays", shortWeekdays },
    { "shortMonths", shortMonths },
    { "months", months },
    { "ampms", ampms },
    { "shortDateFormat", shortDateFormat },
    { "defaultTimeFormat", defaultTimeFormat },
    { "currencySymbol", currencySymbol },
    { "intlCurrencySymbol", intlCurrencySymbol },
    { "currencyFormat", currencyFormat },
    { "decimalSeparator", decimalSeparator },
    { "groupingSeparator", groupingSeparator },
    { "numberFormat", numberFormat },
    { "percentFormat", percentFormat },
  };

  public Object[][] getContents () { return contents; }
}