SUMMARY = "Aglare-skin"
MAINTAINER = "Lululla"
SECTION = "base"
PRIORITY = "required"
LICENSE = "proprietary"

require conf/license/license-gplv2.inc

inherit gitpkgv allarch


SRCREV = "${AUTOREV}"
PV = "1.0+git${SRCPV}"
PKGV = "1.0+git${GITPKGV}"
VER ="1.0"
PR = "r0"

SRC_URI = "git://github.com/Belfagor2005/enigma2-plugin-skins-aglare-atv.git;protocol=https;branch=main"

FILES:${PN} = "/usr/*"

S = "${WORKDIR}/git"

do_compile() {
}

do_install() {
	install -d ${D}/usr
	cp -r --preserve=mode,links ${S}/usr/* ${D}/usr/
	chmod -R a+rX ${D}/usr
}
