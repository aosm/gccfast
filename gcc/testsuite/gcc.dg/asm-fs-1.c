/* Origin: <hp@bitrange.com>
   Make sure we do not get spurious '*' characters in section names or
   elsewhere, with asm-specified names.  */
/* { dg-do compile } */
/* { dg-options "-w -ffunction-sections -fdata-sections" } */

void foo (void) asm ("_bar");
void foo (void) {}

extern int foobar asm ("_baz");
int foobar = 3;

/* APPLE LOCAL BEGIN currently fails on darwin (Radar 3191432) mrs */
/* { dg-final { scan-assembler-not "\\*_bar" { xfail *-*-darwin* } } } */
/* { dg-final { scan-assembler-not "\\*_baz" { xfail *-*-darwin* } } } */
/* APPLE LOCAL END currently fails on darwin (Radar 3191432) mrs */
