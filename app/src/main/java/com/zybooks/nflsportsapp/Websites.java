package com.zybooks.nflsportsapp;

public class Websites {

  private final String teamName;

  public Websites(String teamName) {
    this.teamName = teamName;
  }

  public String[] getTeamStories() {
    switch (teamName) {
      case "Arizona Cardinals":
        return cardinals;
      case "Atlanta Falcons":
        return falcons;
      case "Baltimore Ravens":
        return ravens;
      case "Buffalo Bills":
        return bills;
      case "Carolina Panthers":
        return panthers;
      case "Chicago Bears":
        return bears;
      case "Cincinnati Bengals":
        return bengals;
      case "Cleveland Browns":
        return browns;
      case "Dallas Cowboys":
        return cowboys;
      case "Denver Broncos":
        return broncos;
      case "Detroit Lions":
        return lions;
      case "Green Bay Packers":
        return packers;
      case "Houston Texans":
        return texans;
      case "Indianapolis Colts":
        return colts;
      case "Jacksonville Jaguars":
        return jaguars;
      case "Kansas City Chiefs":
        return chiefs;
      case "Las Vegas Raiders":
        return raiders;
      case "Los Angeles Chargers":
        return chargers;
      case "Los Angeles Rams":
        return rams;
      case "Miami Dolphins":
        return dolphins;
      case "Minnesota Vikings":
        return vikings;
      case "New England Patriots":
        return patriots;
      case "New Orleans Saints":
        return saints;
      case "New York Giants":
        return giants;
      case "New York Jets":
        return jets;
      case "Philadelphia Eagles":
        return eagles;
      case "Pittsburgh Steelers":
        return steelers;
      case "San Fransisco 49ers":
        return fortyNine;
      case "Seattle Seahawks":
        return seahawks;
      case "Tampa Bay Buccaneers":
        return buccaneers;
      case "Tennessee Titans":
        return titans;
      case "Washington Football Team":
        return footballTeam;
    }
    return null;
  }

  private final String[] cardinals = {
    "https://www.azcardinals.com/news/cardinals-get-veteran-quarterback-after-signing-colt-mccoy",
    "https://www.azcardinals.com/news/it-s-official-nfl-and-cardinals-have-17-game-season",
    "https://www.azcardinals.com/news/post-patrick-peterson-malcolm-butler-arrives-to-aid-cardinals-cornerback-crew",
    "https://www.azcardinals.com/news/you-ve-got-mail-filling-out-the-roster",
    "https://www.azcardinals.com/news/arizona-state-s-frank-darby-ready-to-follow-n-keal-harry-brandon-aiyuk-to-nfl"
  };

  private final String[] falcons = {
    "https://www.atlantafalcons.com/news/nfl-owners-approve-17-game-schedule-falcons-to-play-jaguars",
    "https://www.atlantafalcons.com/news/pro-day-tracker-updating-list-of-schools-prospects-and-falcons-visits",
    "https://www.atlantafalcons.com/news/how-the-49ers-recent-trade-with-dolphins-impacts-falcons-draft-plans",
    "https://www.atlantafalcons.com/photos/new-faces-in-the-atl-2021-free-agency",
    "https://www.atlantafalcons.com/news/atlanta-falcons-2021-mock-nfl-draft-tracker"
  };

  String[] ravens = {
    "https://www.baltimoreravens.com/news/late-for-work-3-31-ravens-linked-to-antonio-brown-again",
    "https://www.baltimoreravens.com/news/ravens-to-host-rams-in-new-17-game-season",
    "https://www.baltimoreravens.com/news/eisenberg-offensive-upgrade-in-progress",
    "https://www.baltimoreravens.com/news/late-for-work-3-30-what-areas-do-the-ravens-still-need-to-address-this-offseason",
    "https://www.baltimoreravens.com/news/around-the-afc-north-bengals-sitting-pretty-to-draft-playmaker-at-no-5"
  };

  String[] bills = {
    "https://www.buffalobills.com/news/bills-today-3-takeaways-from-the-nfl-owners-meeting",
    "https://www.buffalobills.com/news/bills-sign-offensive-lineman-bobby-hart",
    "https://www.buffalobills.com/news/bills-to-host-the-washington-football-team-as-nfl-adds-17th-regular-season-game",
    "https://www.buffalobills.com/video/buffalo-bills-formally-introduce-highmark-stadium",
    "https://www.buffalobills.com/video/dave-anderson-we-can-represent-the-community"
  };

  String[] panthers = {
    "https://www.panthers.com/news/justin-fields-pro-day-draft-profile-ohio-state",
    "https://www.panthers.com/video/daniel-jeremiah-shares-takeaways-from-justin-fields-pro-day-workout",
    "https://www.panthers.com/news/panthers-texans-17th-game-added-2021",
    "https://www.panthers.com/news/panthers-add-wide-receiver-micah-simon",
    "https://www.panthers.com/news/mac-jones-defends-his-athleticism"
  };

  String[] bears = {
    "https://www.chicagobears.com/news/chalktalk/chalk-talk-why-do-bears-visit-raiders-17th-game-las-vegas",
    "https://www.chicagobears.com/news/owners-vote-to-expand-nfl-season-to-17-games-bears-raiders-las-vegas",
    "https://www.chicagobears.com/news/bears-have-four-swings-in-sixth-round-of-2021-nfl-draft",
    "https://www.chicagobears.com/news/roster-move-bears-land-ex-chiefs-rb-williams",
    "https://www.chicagobears.com/news/roster-move-bears-re-sign-cb-artie-burns"
  };

  String[] bengals = {
    "https://www.bengals.com/news/mike-daniels-re-ups-on-bengals-front-i-m-going-to-take-it-up-another-notch",
    "https://www.bengals.com/news/amani-bledsoe-re-signs-with-the-bengals",
    "https://www.bengals.com/news/bengals-re-sign-mike-daniels",
    "https://www.bengals.com/news/bengals-host-nine-regular-season-home-games-in-2021-as-nfl-moves-to-17-game-sche",
    "https://www.bengals.com/news/quinton-spain-re-signs-with-the-bengals"
  };

  String[] browns = {
    "https://www.clevelandbrowns.com/news/the-women-of-the-cleveland-browns-share-their-stories-detail-the-impact-they-mak",
    "https://www.clevelandbrowns.com/news/browns-to-host-cardinals-in-2021-as-nfl-adds-17th-game-to-regular-season-schedul",
    "https://www.clevelandbrowns.com/news/browns-mailbag-when-would-bolstering-offense-make-sense-in-2021-nfl-draft",
    "https://www.clevelandbrowns.com/news/troy-hill-excited-for-cleveland-homecoming-potential-for-revamped-browns-seconda",
    "https://www.clevelandbrowns.com/news/browns-re-sign-cb-brian-allen"
  };

  String[] cowboys = {
    "https://www.dallascowboys.com/news/free-agency-tracker-2021",
    "https://www.dallascowboys.com/news/mailbag-plan-for-the-draft-class-k-j-wright",
    "https://www.dallascowboys.com/news/goodell-expects-to-have-full-stadiums-in-2021",
    "https://www.dallascowboys.com/news/mccarthy-quinn-check-out-ohio-state-pro-day",
    "https://www.dallascowboys.com/news/nfl-officially-adds-17th-game-cowboys-vs-patriots"
  };

  String[] broncos = {
    "https://www.denverbroncos.com/news/mile-high-morning-after-nfl-season-expands-to-17-games-broncos-strength-of-sched",
    "https://www.denverbroncos.com/news/quarterback-prospect-justin-fields-dazzles-in-ohio-state-pro-day-workout",
    "https://www.denverbroncos.com/news/nfl-officially-approves-17-game-schedule-denver-to-host-nine-regular-season-game",
    "https://www.denverbroncos.com/news/the-story-of-the-two-broncos-nutritionists-who-shaped-the-future-of-their-field-",
    "https://www.denverbroncos.com/photos/inside-offseason-workouts-with-courtland-sutton-noah-fant-and-albert-okwuegbunam#896c5f5d-c0fd-40ba-a75f-3d75ae30d5c0"
  };

  String[] lions = {
    "https://www.detroitlions.com/news/the-daily-drive-lions-to-officially-play-broncos-in-2021-as-nfl-expands-regular-",
    "https://www.detroitlions.com/news/meet-the-prospect-rashawn-slater",
    "https://www.detroitlions.com/news/lions-added-speed-at-wide-receiver-this-offseason-williams-perriman",
    "https://www.detroitlions.com/news/the-daily-drive-dan-campbell-touts-detroit-lions-patchwork-approach-to-free-agen",
    "https://www.detroitlions.com/news/o-hara-lions-early-qb-deal-showed-they-re-not-afraid-to-set-the-market"
  };

  String[] packers = {
    "https://www.packers.com/news/2021-green-bay-packers-free-agency-tracker",
    "https://www.packers.com/news/5-things-learned-from-mark-murphy-following-virtual-owners-meeting",
    "https://www.packers.com/news/inbox-it-creates-an-edge-that-never-dulls",
    "https://www.packers.com/news/packers-prepared-for-enhanced-nfl-schedule-beginning-in-2021",
    "https://www.packers.com/news/packers-re-sign-te-marcedes-lewis-dl-tyler-lancaster"
  };

  String[] texans = {
    "https://www.houstontexans.com/news/transcripts-christian-kirksey-press-conference-3-30-2021",
    "https://www.houstontexans.com/news/nfl-season-to-feature-17-regular-season-games-per-team",
    "https://www.houstontexans.com/news/14-things-to-know-about-associate-head-coach-defensive-coordinator-lovie-smith",
    "https://www.houstontexans.com/news/sweet-17-vandermeer-s-view",
    "https://www.houstontexans.com/news/jaguars-colts-and-titans-make-donation-in-support-of-texans-and-houston-communit"
  };

  String[] colts = {
    "https://www.colts.com/news/tom-brady-tampa-bay-buccaneers-17-regular-season-game-lucas-oil-2021-season",
    "https://www.colts.com/news/press-taylor-carson-wentz-strong-belief-indianapolis-colts-frank-reich",
    "https://www.colts.com/news/free-agency-tracker-unrestricted-restricted-free-agents-2021-free-agency",
    "https://www.colts.com/news/julien-devenport-joey-hunt-sign-free-agency-2021-houston-texans-miami-dolphins",
    "https://www.colts.com/news/jaelan-phillips-gregory-rousseau-sam-cosmi-kwity-paye-mock-draft-2021-nfl-draft"
  };

  String[] jaguars = {
    "https://www.jaguars.com/news/the-21-draft-quarterbacks",
    "https://www.jaguars.com/news/jaguars-re-sign-safety-josh-jones",
    "https://www.jaguars.com/news/mock-draft-tracker-10-0-safety-lines-popular-at-no-25",
    "https://www.jaguars.com/news/resetting-the-roster-defense",
    "https://www.jaguars.com/news/jaguars-sign-defensive-end-adam-gotsis"
  };

  String[] chiefs = {
    "https://www.chiefs.com/video/tight-end-draft-prospect-highlights-draft-talk-2021",
    "https://www.chiefs.com/photos/photos-chiefs-vs-packers-history#b31a0433-d69a-498f-9532-48e9db090014",
    "https://www.chiefs.com/news/chiefs-to-host-ninth-regular-season-home-game-in-2021-packers-to-visit-geha-fiel",
    "https://www.chiefs.com/photos/photos-the-best-fits-of-2020#1d260dc8-a919-48d4-9565-e68a26cabf36",
    "https://www.chiefs.com/video/overall-draft-analysis-with-todd-mcshay-2021-draft-minute"
  };

  String[] raiders = {
    "https://www.raiders.com/audio/willie-snead-iv-on-opportunity-in-vegas-meeting-coach-gruden-free-agency-2021",
    "https://www.raiders.com/news/raiders-yannick-ngakoue-have-to-be-a-fool-not-to-play-for-the-raiders",
    "https://www.raiders.com/news/nfl-announces-approved-17-game-nfl-schedule",
    "https://www.raiders.com/news/darren-waller-shares-story-with-youth-in-north-las-vegas",
    "https://www.raiders.com/news/raiders-mailbag-how-will-the-new-free-agent-signings-impact-the-silver-and-black"
  };

  String[] chargers = {
    "https://www.chargers.com/news/ryan-smith-signs-with-chargers",
    "https://www.chargers.com/video/camera-on-jared-cook-chargers-free-agency",
    "https://www.chargers.com/news/nfl-2021-season-chargers-host-vikings",
    "https://www.chargers.com/photos/chargers-2021-opponents",
    "https://www.chargers.com/news/chase-daniel-knowledge-experience-quarterbacks-room"
  };

  String[] rams = {
    "https://www.therams.com/news/desean-jackson-looks-to-continue-community-impact-in-his-hometown",
    "https://www.therams.com/news/nfl-expands-regular-season-17-games-what-rams-fans-should-know",
    "https://www.therams.com/news/mock-draft-roundup-predictions-one-month-away-from-2021-nfl-draft",
    "https://www.therams.com/news/desean-jackson-arrival-helps-address-offseason-priority",
    "https://www.therams.com/news/matthew-stafford-can-cement-legacy-in-los-angeles"
  };

  String[] dolphins = {
    "https://www.miamidolphins.com/news/miami-dolphins-make-trades-with-san-francisco-and-philadelphia",
    "https://www.miamidolphins.com/news/miami-dolphins-re-sign-lb-elandon-roberts",
    "https://www.miamidolphins.com/news/miami-dolphins-sign-wr-kai-locksley",
    "https://www.miamidolphins.com/news/miami-dolphins-re-sign-wr-mack-hollins",
    "https://www.miamidolphins.com/news/new-acquisition-analysis-duke-riley"
  };

  String[] vikings = {
    "https://www.vikings.com/news/harrison-smith-fran-tarkenton-top-drafted",
    "https://www.vikings.com/news/mackensie-alexander-contract-cornerback-return-free-agency",
    "https://www.vikings.com/news/2021-free-agency-tracker",
    "https://www.vikings.com/news/dakota-dozier-guard-hale-hentges-free-agency",
    "https://www.vikings.com/news/nfl-17-games-2021-regular-season-preseason"
  };

  String[] patriots = {
    "https://www.patriots.com/news/patriots-news-blitz-3-31-patriots-are-preparing-for-2021-nfl-draft",
    "https://www.patriots.com/news/patriots-re-sign-dl-lawrence-guy",
    "https://www.patriots.com/news/report-patriots-can-begin-offseason-program-april-19",
    "https://www.patriots.com/news/analysis-what-nfl-s-new-schedule-format-means-for-patriots-from-now-on",
    "https://www.patriots.com/news/nfl-season-to-feature-17-regular-season-games-per-team"
  };

  String[] saints = {
    "https://www.neworleanssaints.com/photos/saints-on-social-2021-march-26-march-31#933774c4-6c2c-4679-bddf-65a9819055c5",
    "https://www.neworleanssaints.com/news/what-new-orleans-saints-fans-need-to-know-about-their-newest-opponent-the-tennes",
    "https://www.neworleanssaints.com/news/saints-morning-break-for-wednesday-march-31",
    "https://www.neworleanssaints.com/audio/nick-vannett-tanoh-kpassagnon-on-the-new-orleans-saints-podcast-presented-by-sea",
    "https://www.neworleanssaints.com/news/nfl-s-2021-season-to-feature-17-regular-season-games-three-preseason-games"
  };

  String[] giants = {
    "https://www.giants.com/news/nfc-east-off-season-roundup-giants-eagles-cowboys-washington-2021-free-agency",
    "https://www.giants.com/news/nfl-schedule-expansion-owners-season-17-games-miami-dolphins-roger-goodell",
    "https://www.giants.com/news/nfl-strength-of-schedule-2021-opponents-formula-how-it-works",
    "https://www.giants.com/news/giants-sign-former-titans-dbs-joshua-kalu-chris-milton-te-cole-hikutini-added",
    "https://www.giants.com/photos/photos-every-offseason-move-made-by-giants#c33e68dd-d7cb-40c8-907b-1201b1c5e24a"
  };

  String[] jets = {
    "https://www.newyorkjets.com/news/17th-game-added-2021-nfl-schedule-jets-vs-eagles",
    "https://www.newyorkjets.com/photos/2021-jets-opponents-in-photos",
    "https://www.newyorkjets.com/news/bleacher-report-gives-jets-an-a-in-free-agency",
    "https://www.newyorkjets.com/news/5-things-to-know-about-new-jets-dl-sheldon-rankins",
    "https://www.newyorkjets.com/news/jets-draft-preview-deep-edge-class-despite-no-consensus-up-top"
  };

  String[] eagles = {
    "https://www.philadelphiaeagles.com/news/with-a-17th-game-what-eagles-records-will-be-broken",
    "https://www.philadelphiaeagles.com/news/eagles-to-play-new-york-jets-in-2021",
    "https://www.philadelphiaeagles.com/news/eagles-free-agency-tracker-2021",
    "https://www.philadelphiaeagles.com/news/spadaro-dont-sleep-on-free-agency",
    "https://www.philadelphiaeagles.com/news/spadaro-reaction-draft-trade-dolphins"
  };

  String[] steelers = {
    "https://www.steelers.com/news/rookie-recap-james-pierre",
    "https://www.steelers.com/video/1-on-1-with-dotson",
    "https://www.steelers.com/photos/photos-all-time-rookie-leaders-rushing-yards-20483205",
    "https://www.steelers.com/news/nfl-owners-vote-for-17-game-regular-season",
    "https://www.steelers.com/news/winning-the-battle-against-the-doubts"
  };

  String[] fortyNine = {
    "https://www.49ers.com/video/lance-zierlein-nfl-network-trey-lance-49ers-at-no-3-draft",
    "https://www.49ers.com/news/women-s-history-month-recap",
    "https://www.49ers.com/news/morning-report-49ers-add-road-game-vs-bengals-kwaun-williams-free-agency",
    "https://www.49ers.com/news/k-waun-williams-49ers-free-agency-cornerbacks-tartt-moseley-juszczyk-ward",
    "https://www.49ers.com/video/1-on-1-k-waun-williams-says-49ers-defense-has-no-limit"
  };

  String[] seahawks = {
    "https://www.seahawks.com/news/five-things-to-know-about-new-seahawks-guard-gabe-jackson",
    "https://www.seahawks.com/news/new-seahawks-g-gabe-jackson-excited-to-join-the-12s",
    "https://www.seahawks.com/news/nfl-teams-approve-17-game-schedule-seahawks-add-game-at-pittsburgh-in-2021",
    "https://www.seahawks.com/news/seahawks-re-sign-de-carlos-dunlap-ii",
    "https://www.seahawks.com/news/monday-round-up-bobby-wagner-talks-venture-capital-with-geekwire"
  };

  String[] buccaneers = {
    "https://www.buccaneers.com/news/running-back-leonard-fournette-signs-new-deal-2021-buccaneers",
    "https://www.buccaneers.com/video/leonard-fournette-re-signs-tampa-bay-buccaneers-2021-free-agency-interview",
    "https://www.buccaneers.com/news/tight-end-o-j-howard-2021-return-from-achilles-injury-bruce-arians-interview",
    "https://www.buccaneers.com/video/bucs-2021-free-agency-nfl-draft-prospects-pick-32-bucs-insider",
    "https://www.buccaneers.com/news/bucs-2021-opponents-nfl-information-nfc-afc-indianapolis-colts-17-regular-season"
  };

  String[] titans = {
    "https://www.tennesseetitans.com/news/bud",
    "https://www.tennesseetitans.com/news/titans-to-host-saints-in-2021-as-nfl-adds-17th-regular-season-game",
    "https://www.tennesseetitans.com/news/titans-reach-deal-with-veteran-safety-matthias-farley",
    "https://www.tennesseetitans.com/news/tuesday-mailbag-jim-wyatt-answers-questions-from-titans-fans-x9395",
    "https://www.tennesseetitans.com/news/who-will-the-titans-pick-an-updated-tour-of-the-mock-draft-following-the-first-w"
  };

  String[] footballTeam = {
    "https://www.washingtonfootball.com/news/wake-up-washington-buffalo-bills-17th-game-2021",
    "https://www.washingtonfootball.com/news/washington-2021-opponents-home-away",
    "https://www.washingtonfootball.com/news/2021-washington-free-agency-journal",
    "https://www.washingtonfootball.com/news/washington-2021-mock-draft-madness",
    "https://www.washingtonfootball.com/news/terry-mclaurin-curtis-samuel-washington-impact"
  };
}
