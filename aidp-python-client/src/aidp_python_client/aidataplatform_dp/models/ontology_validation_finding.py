# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyValidationFinding(object):
    """
    Result produced by a single rule during ontology validation.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyValidationFinding object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param rule_id:
            The value to assign to the rule_id property of this OntologyValidationFinding.
        :type rule_id: str

        :param status:
            The value to assign to the status property of this OntologyValidationFinding.
        :type status: str

        :param severity:
            The value to assign to the severity property of this OntologyValidationFinding.
        :type severity: str

        :param message:
            The value to assign to the message property of this OntologyValidationFinding.
        :type message: str

        """
        self.swagger_types = {
            'rule_id': 'str',
            'status': 'str',
            'severity': 'str',
            'message': 'str'
        }

        self.attribute_map = {
            'rule_id': 'ruleId',
            'status': 'status',
            'severity': 'severity',
            'message': 'message'
        }

        self._rule_id = None
        self._status = None
        self._severity = None
        self._message = None

    @property
    def rule_id(self):
        """
        Gets the rule_id of this OntologyValidationFinding.
        Stable identifier of the validation rule that produced this finding.


        :return: The rule_id of this OntologyValidationFinding.
        :rtype: str
        """
        return self._rule_id

    @rule_id.setter
    def rule_id(self, rule_id):
        """
        Sets the rule_id of this OntologyValidationFinding.
        Stable identifier of the validation rule that produced this finding.


        :param rule_id: The rule_id of this OntologyValidationFinding.
        :type: str
        """
        self._rule_id = rule_id

    @property
    def status(self):
        """
        Gets the status of this OntologyValidationFinding.
        Outcome reported by the validation rule.


        :return: The status of this OntologyValidationFinding.
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """
        Sets the status of this OntologyValidationFinding.
        Outcome reported by the validation rule.


        :param status: The status of this OntologyValidationFinding.
        :type: str
        """
        self._status = status

    @property
    def severity(self):
        """
        Gets the severity of this OntologyValidationFinding.
        Importance level assigned to the validation finding.


        :return: The severity of this OntologyValidationFinding.
        :rtype: str
        """
        return self._severity

    @severity.setter
    def severity(self, severity):
        """
        Sets the severity of this OntologyValidationFinding.
        Importance level assigned to the validation finding.


        :param severity: The severity of this OntologyValidationFinding.
        :type: str
        """
        self._severity = severity

    @property
    def message(self):
        """
        Gets the message of this OntologyValidationFinding.
        Human-readable explanation of the validation finding.


        :return: The message of this OntologyValidationFinding.
        :rtype: str
        """
        return self._message

    @message.setter
    def message(self, message):
        """
        Sets the message of this OntologyValidationFinding.
        Human-readable explanation of the validation finding.


        :param message: The message of this OntologyValidationFinding.
        :type: str
        """
        self._message = message

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
