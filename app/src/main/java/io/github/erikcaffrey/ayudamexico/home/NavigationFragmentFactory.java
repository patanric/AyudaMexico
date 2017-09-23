package io.github.erikcaffrey.ayudamexico.home;

import android.support.v4.app.Fragment;
import io.github.erikcaffrey.ayudamexico.R;
import io.github.erikcaffrey.ayudamexico.announcement.ui.AnnouncementFragment;
import io.github.erikcaffrey.ayudamexico.areas.AreasFragment;
import io.github.erikcaffrey.ayudamexico.areas.CdmxMapFragment;
import io.github.erikcaffrey.ayudamexico.bloodbank.BloodBankFragment;
import io.github.erikcaffrey.ayudamexico.centers.ui.GatheringFragment;
import io.github.erikcaffrey.ayudamexico.donations.DonationsMainFragment;
import io.github.erikcaffrey.ayudamexico.faqs.QuestionsFragment;
import io.github.erikcaffrey.ayudamexico.finder.PeopleFinderFragment;
import io.github.erikcaffrey.ayudamexico.help.ui.HelpFragment;
import io.github.erikcaffrey.ayudamexico.hospitals.ui.HospitalsFragment;
import io.github.erikcaffrey.ayudamexico.hostels.ui.HostelsFragment;
import io.github.erikcaffrey.ayudamexico.internet.InternetFragment;
import io.github.erikcaffrey.ayudamexico.phones.PhoneListsFragment;

class NavigationFragmentFactory {

    private static int title = 0;

    static Fragment create(int itemId) {
        Fragment fragment = null;
        switch (itemId) {
            case R.id.nav_hospitals:
                fragment = HospitalsFragment.newInstance();
                title = R.string.hospitals;
                break;
            case R.id.nav_blood_bank:
                fragment = BloodBankFragment.newInstance();
                title = R.string.blood_bank;
                break;
            case R.id.nav_hotels:
                fragment = HostelsFragment.newInstance();
                title = R.string.hostels;
                break;
            case R.id.nav_gathering:
                fragment = GatheringFragment.newInstance();
                title = R.string.gathering_center;
                break;
            case R.id.nav_help_cdmx:
                fragment = HelpFragment.newInstance();
                title = R.string.help_cdmx;
                break;
            case R.id.nav_phones:
                fragment = PhoneListsFragment.newInstance();
                title = R.string.phones;
                break;
            case R.id.nav_areas:
                fragment = AreasFragment.newInstance();
                title = R.string.affected_areas;
                break;
            case R.id.nav_real_time:
                fragment = CdmxMapFragment.newInstance();
                title = R.string.real_time;
                break;
            case R.id.nav_person_finder:
                fragment = PeopleFinderFragment.newInstance();
                title = R.string.person_finder;
                break;
            case R.id.nav_announcement:
                fragment = AnnouncementFragment.newInstance();
                title = R.string.announcement;
                break;

            case R.id.nav_donations:
                fragment = DonationsMainFragment.newInstance();
                title = R.string.donations;
                break;
            case R.id.nav_wifi:
                fragment = InternetFragment.newInstance();
                title = R.string.faqs;
                break;

            case R.id.nav_faqs:
                fragment = QuestionsFragment.newInstance();
                title = R.string.faqs;
                break;
        }
        return fragment;
    }

    static int getTitle() {
        return title;
    }
}
