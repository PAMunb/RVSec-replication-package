onedev.server.codeProblem = {
	getIconInfo: function(problems) {
		if (Array.isArray(problems)) {
			var hasHighSeverities = false;
			var hasMediumSeverities = false;
			for (var i in problems) {
				if (problems[i].severity == "HIGH") {
					hasHighSeverities = true;
					break;
				} else if (problems[i].severity == "MEDIUM") {
					hasMediumSeverities = true;
				}
			}
			if (hasHighSeverities)
				return ["times-circle-o", "link-danger", "text-danger"];
			else if (hasMediumSeverities)
				return ["warning-o", "link-warning", "text-warning"];
			else
				return ["info-circle-o", "link-info", "text-info"];
		} else {
			if (problems.severity == "HIGH")
				return ["times-circle-o", "link-danger", "text-danger"];
			else if (problems.severity == "MEDIUM")
				return ["warning-o", "link-warning", "text-warning"];
			else
				return ["info-circle-o", "link-info", "text-info"];
		}
	},
	renderProblems: function(problems) {
		if (problems.length != 1) {
			var $container = $("<div></div>");
			for (var i in problems) {
				var problem = problems[i];
				var iconInfo = onedev.server.codeProblem.getIconInfo(problem);
				var $content = $("<pre class='problem-content mb-0 font-size-sm'></pre>");
				$container.append($content);
				$content.html(problem.message);
				
				$content.prepend(`<svg class='icon icon-sm mr-2 ${iconInfo[2]}'><use xlink:href='${onedev.server.icons}#${iconInfo[0]}'/></svg>`);
				$content.append("<a title='Add comment' class='add-comment ml-2'><svg class='icon icon-sm mr-2'><use xlink:href='" + onedev.server.icons + "#comment'/></svg></a>");
			}
			return $container.html();
		} else {
			var $container = $("<div><pre class='problem-content mb-0 font-size-sm'></pre></div>");
			var $content = $container.children('.problem-content');
			$content.html(problems[0].message);
			$content.append("<a title='Add comment' class='add-comment ml-2'><svg class='icon icon-sm mr-2'><use xlink:href='" + onedev.server.icons + "#comment'/></svg></a>");
			return $container.html();
		}
	} 
}