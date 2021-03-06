// This file was automatically generated by localedef.

package gnu.java.locale;

import java.util.ListResourceBundle;

public class LocaleInformation_fi_FI extends ListResourceBundle
{
  static final String decimalSeparator = ",";
  static final String groupingSeparator = ".";
  static final String numberFormat = "#,###,##0.###";
  static final String percentFormat = "#,###,##0%";
  static final String[] weekdays = { null, "sunnuntai", "maanantai", "tiistai", "keskiviikko", "torstai", "perjantai", "lauantai" };

  static final String[] shortWeekdays = { null, "su", "ma", "ti", "ke", "to", "pe", "la" };

  static final String[] shortMonths = { "tammi\u00A0", "helmi\u00A0", "maalis", "huhti\u00A0", "touko\u00A0", "kes\u00E4\u00A0\u00A0", "hein\u00E4\u00A0", "elo\u00A0\u00A0\u00A0", "syys\u00A0\u00A0", "loka\u00A0\u00A0", "marras", "joulu\u00A0", null };

  static final String[] months = { "tammikuu", "helmikuu", "maaliskuu", "huhtikuu", "toukokuu", "kes\u00E4kuu", "hein\u00E4kuu", "elokuu", "syyskuu", "lokakuu", "marraskuu", "joulukuu", null };

  static final String[] ampms = { "", "" };

  static final String shortDateFormat = "dd.MM.yyyy";
  static final String defaultTimeFormat = "";
  static final String currencySymbol = "mk";
  static final String intlCurrencySymbol = "FIM";
  static final String currencyFormat = "#,###,##0.00 $;-#,###,##0.00 $";

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
