# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AgentFlowValidationMetadata(object):
    """
    Non-sensitive metadata for Agent Flow diagram validation.
    """

    #: A constant which can be used with the skipped_phases property of a AgentFlowValidationMetadata.
    #: This constant has a value of "MODEL"
    SKIPPED_PHASES_MODEL = "MODEL"

    #: A constant which can be used with the skipped_phases property of a AgentFlowValidationMetadata.
    #: This constant has a value of "GRAPH"
    SKIPPED_PHASES_GRAPH = "GRAPH"

    #: A constant which can be used with the skipped_phases property of a AgentFlowValidationMetadata.
    #: This constant has a value of "CONFIG"
    SKIPPED_PHASES_CONFIG = "CONFIG"

    #: A constant which can be used with the skipped_phases property of a AgentFlowValidationMetadata.
    #: This constant has a value of "REFERENCE"
    SKIPPED_PHASES_REFERENCE = "REFERENCE"

    #: A constant which can be used with the skipped_phases property of a AgentFlowValidationMetadata.
    #: This constant has a value of "CODEGEN"
    SKIPPED_PHASES_CODEGEN = "CODEGEN"

    def __init__(self, **kwargs):
        """
        Initializes a new AgentFlowValidationMetadata object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param is_deep_validation_skipped:
            The value to assign to the is_deep_validation_skipped property of this AgentFlowValidationMetadata.
        :type is_deep_validation_skipped: bool

        :param skip_reason:
            The value to assign to the skip_reason property of this AgentFlowValidationMetadata.
        :type skip_reason: str

        :param lake_flow_request_id:
            The value to assign to the lake_flow_request_id property of this AgentFlowValidationMetadata.
        :type lake_flow_request_id: str

        :param duration_in_millis:
            The value to assign to the duration_in_millis property of this AgentFlowValidationMetadata.
        :type duration_in_millis: int

        :param skipped_phases:
            The value to assign to the skipped_phases property of this AgentFlowValidationMetadata.
            Allowed values for items in this list are: "MODEL", "GRAPH", "CONFIG", "REFERENCE", "CODEGEN"
        :type skipped_phases: list[str]

        :param rule_durations_in_millis:
            The value to assign to the rule_durations_in_millis property of this AgentFlowValidationMetadata.
        :type rule_durations_in_millis: dict(str, int)

        """
        self.swagger_types = {
            'is_deep_validation_skipped': 'bool',
            'skip_reason': 'str',
            'lake_flow_request_id': 'str',
            'duration_in_millis': 'int',
            'skipped_phases': 'list[str]',
            'rule_durations_in_millis': 'dict(str, int)'
        }

        self.attribute_map = {
            'is_deep_validation_skipped': 'isDeepValidationSkipped',
            'skip_reason': 'skipReason',
            'lake_flow_request_id': 'lakeFlowRequestId',
            'duration_in_millis': 'durationInMillis',
            'skipped_phases': 'skippedPhases',
            'rule_durations_in_millis': 'ruleDurationsInMillis'
        }

        self._is_deep_validation_skipped = None
        self._skip_reason = None
        self._lake_flow_request_id = None
        self._duration_in_millis = None
        self._skipped_phases = None
        self._rule_durations_in_millis = None

    @property
    def is_deep_validation_skipped(self):
        """
        Gets the is_deep_validation_skipped of this AgentFlowValidationMetadata.
        Whether deep validation was skipped.


        :return: The is_deep_validation_skipped of this AgentFlowValidationMetadata.
        :rtype: bool
        """
        return self._is_deep_validation_skipped

    @is_deep_validation_skipped.setter
    def is_deep_validation_skipped(self, is_deep_validation_skipped):
        """
        Sets the is_deep_validation_skipped of this AgentFlowValidationMetadata.
        Whether deep validation was skipped.


        :param is_deep_validation_skipped: The is_deep_validation_skipped of this AgentFlowValidationMetadata.
        :type: bool
        """
        self._is_deep_validation_skipped = is_deep_validation_skipped

    @property
    def skip_reason(self):
        """
        Gets the skip_reason of this AgentFlowValidationMetadata.
        Reason deep validation was skipped.


        :return: The skip_reason of this AgentFlowValidationMetadata.
        :rtype: str
        """
        return self._skip_reason

    @skip_reason.setter
    def skip_reason(self, skip_reason):
        """
        Sets the skip_reason of this AgentFlowValidationMetadata.
        Reason deep validation was skipped.


        :param skip_reason: The skip_reason of this AgentFlowValidationMetadata.
        :type: str
        """
        self._skip_reason = skip_reason

    @property
    def lake_flow_request_id(self):
        """
        Gets the lake_flow_request_id of this AgentFlowValidationMetadata.
        Optional downstream LakeFlow request identifier.


        :return: The lake_flow_request_id of this AgentFlowValidationMetadata.
        :rtype: str
        """
        return self._lake_flow_request_id

    @lake_flow_request_id.setter
    def lake_flow_request_id(self, lake_flow_request_id):
        """
        Sets the lake_flow_request_id of this AgentFlowValidationMetadata.
        Optional downstream LakeFlow request identifier.


        :param lake_flow_request_id: The lake_flow_request_id of this AgentFlowValidationMetadata.
        :type: str
        """
        self._lake_flow_request_id = lake_flow_request_id

    @property
    def duration_in_millis(self):
        """
        Gets the duration_in_millis of this AgentFlowValidationMetadata.
        Validation duration in milliseconds.


        :return: The duration_in_millis of this AgentFlowValidationMetadata.
        :rtype: int
        """
        return self._duration_in_millis

    @duration_in_millis.setter
    def duration_in_millis(self, duration_in_millis):
        """
        Sets the duration_in_millis of this AgentFlowValidationMetadata.
        Validation duration in milliseconds.


        :param duration_in_millis: The duration_in_millis of this AgentFlowValidationMetadata.
        :type: int
        """
        self._duration_in_millis = duration_in_millis

    @property
    def skipped_phases(self):
        """
        Gets the skipped_phases of this AgentFlowValidationMetadata.
        Validation phases that were skipped.

        Allowed values for items in this list are: "MODEL", "GRAPH", "CONFIG", "REFERENCE", "CODEGEN"


        :return: The skipped_phases of this AgentFlowValidationMetadata.
        :rtype: list[str]
        """
        return self._skipped_phases

    @skipped_phases.setter
    def skipped_phases(self, skipped_phases):
        """
        Sets the skipped_phases of this AgentFlowValidationMetadata.
        Validation phases that were skipped.


        :param skipped_phases: The skipped_phases of this AgentFlowValidationMetadata.
        :type: list[str]
        """
        allowed_values = ["MODEL", "GRAPH", "CONFIG", "REFERENCE", "CODEGEN"]
        
        if skipped_phases and skipped_phases is not NONE_SENTINEL:
            for value in skipped_phases:
                if not value_allowed_none_or_none_sentinel(value, allowed_values):
                    raise ValueError(
                        "Invalid value for `skipped_phases`, must be None or one of {0}"
                        .format(allowed_values)
                    )
        self._skipped_phases = skipped_phases

    @property
    def rule_durations_in_millis(self):
        """
        Gets the rule_durations_in_millis of this AgentFlowValidationMetadata.
        Validation rule durations in milliseconds.


        :return: The rule_durations_in_millis of this AgentFlowValidationMetadata.
        :rtype: dict(str, int)
        """
        return self._rule_durations_in_millis

    @rule_durations_in_millis.setter
    def rule_durations_in_millis(self, rule_durations_in_millis):
        """
        Sets the rule_durations_in_millis of this AgentFlowValidationMetadata.
        Validation rule durations in milliseconds.


        :param rule_durations_in_millis: The rule_durations_in_millis of this AgentFlowValidationMetadata.
        :type: dict(str, int)
        """
        self._rule_durations_in_millis = rule_durations_in_millis

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
