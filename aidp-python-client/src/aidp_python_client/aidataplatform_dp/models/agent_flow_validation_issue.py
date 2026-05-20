# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AgentFlowValidationIssue(object):
    """
    A validation issue for an Agent Flow diagram.
    """

    #: A constant which can be used with the severity property of a AgentFlowValidationIssue.
    #: This constant has a value of "ERROR"
    SEVERITY_ERROR = "ERROR"

    #: A constant which can be used with the severity property of a AgentFlowValidationIssue.
    #: This constant has a value of "WARNING"
    SEVERITY_WARNING = "WARNING"

    #: A constant which can be used with the severity property of a AgentFlowValidationIssue.
    #: This constant has a value of "INFO"
    SEVERITY_INFO = "INFO"

    #: A constant which can be used with the phase property of a AgentFlowValidationIssue.
    #: This constant has a value of "MODEL"
    PHASE_MODEL = "MODEL"

    #: A constant which can be used with the phase property of a AgentFlowValidationIssue.
    #: This constant has a value of "GRAPH"
    PHASE_GRAPH = "GRAPH"

    #: A constant which can be used with the phase property of a AgentFlowValidationIssue.
    #: This constant has a value of "CONFIG"
    PHASE_CONFIG = "CONFIG"

    #: A constant which can be used with the phase property of a AgentFlowValidationIssue.
    #: This constant has a value of "REFERENCE"
    PHASE_REFERENCE = "REFERENCE"

    #: A constant which can be used with the phase property of a AgentFlowValidationIssue.
    #: This constant has a value of "CODEGEN"
    PHASE_CODEGEN = "CODEGEN"

    def __init__(self, **kwargs):
        """
        Initializes a new AgentFlowValidationIssue object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param code:
            The value to assign to the code property of this AgentFlowValidationIssue.
        :type code: str

        :param severity:
            The value to assign to the severity property of this AgentFlowValidationIssue.
            Allowed values for this property are: "ERROR", "WARNING", "INFO"
        :type severity: str

        :param phase:
            The value to assign to the phase property of this AgentFlowValidationIssue.
            Allowed values for this property are: "MODEL", "GRAPH", "CONFIG", "REFERENCE", "CODEGEN"
        :type phase: str

        :param message:
            The value to assign to the message property of this AgentFlowValidationIssue.
        :type message: str

        :param path:
            The value to assign to the path property of this AgentFlowValidationIssue.
        :type path: str

        :param node_key:
            The value to assign to the node_key property of this AgentFlowValidationIssue.
        :type node_key: str

        :param edge_key:
            The value to assign to the edge_key property of this AgentFlowValidationIssue.
        :type edge_key: str

        :param resource_key:
            The value to assign to the resource_key property of this AgentFlowValidationIssue.
        :type resource_key: str

        :param suggested_fix:
            The value to assign to the suggested_fix property of this AgentFlowValidationIssue.
        :type suggested_fix: str

        :param details:
            The value to assign to the details property of this AgentFlowValidationIssue.
        :type details: dict(str, object)

        """
        self.swagger_types = {
            'code': 'str',
            'severity': 'str',
            'phase': 'str',
            'message': 'str',
            'path': 'str',
            'node_key': 'str',
            'edge_key': 'str',
            'resource_key': 'str',
            'suggested_fix': 'str',
            'details': 'dict(str, object)'
        }

        self.attribute_map = {
            'code': 'code',
            'severity': 'severity',
            'phase': 'phase',
            'message': 'message',
            'path': 'path',
            'node_key': 'nodeKey',
            'edge_key': 'edgeKey',
            'resource_key': 'resourceKey',
            'suggested_fix': 'suggestedFix',
            'details': 'details'
        }

        self._code = None
        self._severity = None
        self._phase = None
        self._message = None
        self._path = None
        self._node_key = None
        self._edge_key = None
        self._resource_key = None
        self._suggested_fix = None
        self._details = None

    @property
    def code(self):
        """
        **[Required]** Gets the code of this AgentFlowValidationIssue.
        Stable machine-readable validation issue code.


        :return: The code of this AgentFlowValidationIssue.
        :rtype: str
        """
        return self._code

    @code.setter
    def code(self, code):
        """
        Sets the code of this AgentFlowValidationIssue.
        Stable machine-readable validation issue code.


        :param code: The code of this AgentFlowValidationIssue.
        :type: str
        """
        self._code = code

    @property
    def severity(self):
        """
        **[Required]** Gets the severity of this AgentFlowValidationIssue.
        Issue severity.

        Allowed values for this property are: "ERROR", "WARNING", "INFO"


        :return: The severity of this AgentFlowValidationIssue.
        :rtype: str
        """
        return self._severity

    @severity.setter
    def severity(self, severity):
        """
        Sets the severity of this AgentFlowValidationIssue.
        Issue severity.


        :param severity: The severity of this AgentFlowValidationIssue.
        :type: str
        """
        allowed_values = ["ERROR", "WARNING", "INFO"]
        if not value_allowed_none_or_none_sentinel(severity, allowed_values):
            raise ValueError(
                "Invalid value for `severity`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._severity = severity

    @property
    def phase(self):
        """
        **[Required]** Gets the phase of this AgentFlowValidationIssue.
        Validation phase that produced the issue.

        Allowed values for this property are: "MODEL", "GRAPH", "CONFIG", "REFERENCE", "CODEGEN"


        :return: The phase of this AgentFlowValidationIssue.
        :rtype: str
        """
        return self._phase

    @phase.setter
    def phase(self, phase):
        """
        Sets the phase of this AgentFlowValidationIssue.
        Validation phase that produced the issue.


        :param phase: The phase of this AgentFlowValidationIssue.
        :type: str
        """
        allowed_values = ["MODEL", "GRAPH", "CONFIG", "REFERENCE", "CODEGEN"]
        if not value_allowed_none_or_none_sentinel(phase, allowed_values):
            raise ValueError(
                "Invalid value for `phase`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._phase = phase

    @property
    def message(self):
        """
        **[Required]** Gets the message of this AgentFlowValidationIssue.
        Human-readable validation issue message.


        :return: The message of this AgentFlowValidationIssue.
        :rtype: str
        """
        return self._message

    @message.setter
    def message(self, message):
        """
        Sets the message of this AgentFlowValidationIssue.
        Human-readable validation issue message.


        :param message: The message of this AgentFlowValidationIssue.
        :type: str
        """
        self._message = message

    @property
    def path(self):
        """
        Gets the path of this AgentFlowValidationIssue.
        JSON path or logical path to the invalid field.


        :return: The path of this AgentFlowValidationIssue.
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path):
        """
        Sets the path of this AgentFlowValidationIssue.
        JSON path or logical path to the invalid field.


        :param path: The path of this AgentFlowValidationIssue.
        :type: str
        """
        self._path = path

    @property
    def node_key(self):
        """
        Gets the node_key of this AgentFlowValidationIssue.
        Optional node key associated with the issue.


        :return: The node_key of this AgentFlowValidationIssue.
        :rtype: str
        """
        return self._node_key

    @node_key.setter
    def node_key(self, node_key):
        """
        Sets the node_key of this AgentFlowValidationIssue.
        Optional node key associated with the issue.


        :param node_key: The node_key of this AgentFlowValidationIssue.
        :type: str
        """
        self._node_key = node_key

    @property
    def edge_key(self):
        """
        Gets the edge_key of this AgentFlowValidationIssue.
        Optional edge key associated with the issue.


        :return: The edge_key of this AgentFlowValidationIssue.
        :rtype: str
        """
        return self._edge_key

    @edge_key.setter
    def edge_key(self, edge_key):
        """
        Sets the edge_key of this AgentFlowValidationIssue.
        Optional edge key associated with the issue.


        :param edge_key: The edge_key of this AgentFlowValidationIssue.
        :type: str
        """
        self._edge_key = edge_key

    @property
    def resource_key(self):
        """
        Gets the resource_key of this AgentFlowValidationIssue.
        Optional tool, guardrails, catalog, or workspace key associated with the issue.


        :return: The resource_key of this AgentFlowValidationIssue.
        :rtype: str
        """
        return self._resource_key

    @resource_key.setter
    def resource_key(self, resource_key):
        """
        Sets the resource_key of this AgentFlowValidationIssue.
        Optional tool, guardrails, catalog, or workspace key associated with the issue.


        :param resource_key: The resource_key of this AgentFlowValidationIssue.
        :type: str
        """
        self._resource_key = resource_key

    @property
    def suggested_fix(self):
        """
        Gets the suggested_fix of this AgentFlowValidationIssue.
        Optional user-facing remediation text.


        :return: The suggested_fix of this AgentFlowValidationIssue.
        :rtype: str
        """
        return self._suggested_fix

    @suggested_fix.setter
    def suggested_fix(self, suggested_fix):
        """
        Sets the suggested_fix of this AgentFlowValidationIssue.
        Optional user-facing remediation text.


        :param suggested_fix: The suggested_fix of this AgentFlowValidationIssue.
        :type: str
        """
        self._suggested_fix = suggested_fix

    @property
    def details(self):
        """
        Gets the details of this AgentFlowValidationIssue.
        Non-sensitive issue details.


        :return: The details of this AgentFlowValidationIssue.
        :rtype: dict(str, object)
        """
        return self._details

    @details.setter
    def details(self, details):
        """
        Sets the details of this AgentFlowValidationIssue.
        Non-sensitive issue details.


        :param details: The details of this AgentFlowValidationIssue.
        :type: dict(str, object)
        """
        self._details = details

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
