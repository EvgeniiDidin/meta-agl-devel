SUMMARY     = "Mixer for CES2017 AGL Demonstration"
DESCRIPTION = "AGL HMI application for control of PulseAudio mixer elements"
HOMEPAGE    = "https://gerrit.automotivelinux.org/gerrit/#/admin/projects/apps/mixer"
SECTION     = "apps"

LICENSE     = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ae6497158920d9524cf208c09cc4c984"

SRC_URI = "gitsm://gerrit.automotivelinux.org/gerrit/apps/mixer;protocol=https;branch=${AGL_BRANCH}"
SRCREV  = "${AGL_APP_REVISION}"

PV = "1.0+git${SRCPV}"
S  = "${WORKDIR}/git"

# build-time dependencies
DEPENDS += "qtquickcontrols2 \
            qtwebsockets \
            virtual/libhomescreen \
            qlibwindowmanager \
"

RPROVIDES_${PN} += "virtual/mixer"

inherit cmake_qt5 aglwgt
