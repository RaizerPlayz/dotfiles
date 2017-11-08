// Prevent Strg+C from killing sbt.
cancelable in Global := true
// Use coloured console if possible.
initialize ~= (_ =>
  if (ConsoleLogger.formatEnabled)
    sys.props("scala.color") = "true"
)
// Settings for creating fresh projects via sbt-fresh.
import de.heikoseeberger.sbtfresh.FreshPlugin.autoImport._
import de.heikoseeberger.sbtfresh.license.License

freshOrganization     := "com.wegtam"
freshAuthor           := "Jonas Beutlich"
freshLicense          := Some(License.agpl3)
freshSetUpGit         := false
freshSetUpTravis      := false
freshSetUpWartremover := true
freshUseGitPrompt     := true
// Clippy configuration
clippyColorsEnabled := true
