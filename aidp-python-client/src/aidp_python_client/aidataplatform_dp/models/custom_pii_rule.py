# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CustomPiiRule(object):
    """
    Custom PII detection rule.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new CustomPiiRule object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param name:
            The value to assign to the name property of this CustomPiiRule.
        :type name: str

        :param pattern:
            The value to assign to the pattern property of this CustomPiiRule.
        :type pattern: str

        :param prefix:
            The value to assign to the prefix property of this CustomPiiRule.
        :type prefix: str

        :param suffix:
            The value to assign to the suffix property of this CustomPiiRule.
        :type suffix: str

        :param is_case_sensitive:
            The value to assign to the is_case_sensitive property of this CustomPiiRule.
        :type is_case_sensitive: bool

        :param max_distance:
            The value to assign to the max_distance property of this CustomPiiRule.
        :type max_distance: int

        :param priority:
            The value to assign to the priority property of this CustomPiiRule.
        :type priority: int

        """
        self.swagger_types = {
            'name': 'str',
            'pattern': 'str',
            'prefix': 'str',
            'suffix': 'str',
            'is_case_sensitive': 'bool',
            'max_distance': 'int',
            'priority': 'int'
        }

        self.attribute_map = {
            'name': 'name',
            'pattern': 'pattern',
            'prefix': 'prefix',
            'suffix': 'suffix',
            'is_case_sensitive': 'isCaseSensitive',
            'max_distance': 'maxDistance',
            'priority': 'priority'
        }

        self._name = None
        self._pattern = None
        self._prefix = None
        self._suffix = None
        self._is_case_sensitive = None
        self._max_distance = None
        self._priority = None

    @property
    def name(self):
        """
        **[Required]** Gets the name of this CustomPiiRule.
        Name of the custom rule.


        :return: The name of this CustomPiiRule.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this CustomPiiRule.
        Name of the custom rule.


        :param name: The name of this CustomPiiRule.
        :type: str
        """
        self._name = name

    @property
    def pattern(self):
        """
        **[Required]** Gets the pattern of this CustomPiiRule.
        Regex pattern for detection.


        :return: The pattern of this CustomPiiRule.
        :rtype: str
        """
        return self._pattern

    @pattern.setter
    def pattern(self, pattern):
        """
        Sets the pattern of this CustomPiiRule.
        Regex pattern for detection.


        :param pattern: The pattern of this CustomPiiRule.
        :type: str
        """
        self._pattern = pattern

    @property
    def prefix(self):
        """
        Gets the prefix of this CustomPiiRule.
        Prefix pattern to match.


        :return: The prefix of this CustomPiiRule.
        :rtype: str
        """
        return self._prefix

    @prefix.setter
    def prefix(self, prefix):
        """
        Sets the prefix of this CustomPiiRule.
        Prefix pattern to match.


        :param prefix: The prefix of this CustomPiiRule.
        :type: str
        """
        self._prefix = prefix

    @property
    def suffix(self):
        """
        Gets the suffix of this CustomPiiRule.
        Suffix pattern to match.


        :return: The suffix of this CustomPiiRule.
        :rtype: str
        """
        return self._suffix

    @suffix.setter
    def suffix(self, suffix):
        """
        Sets the suffix of this CustomPiiRule.
        Suffix pattern to match.


        :param suffix: The suffix of this CustomPiiRule.
        :type: str
        """
        self._suffix = suffix

    @property
    def is_case_sensitive(self):
        """
        Gets the is_case_sensitive of this CustomPiiRule.
        Whether the pattern is case sensitive.


        :return: The is_case_sensitive of this CustomPiiRule.
        :rtype: bool
        """
        return self._is_case_sensitive

    @is_case_sensitive.setter
    def is_case_sensitive(self, is_case_sensitive):
        """
        Sets the is_case_sensitive of this CustomPiiRule.
        Whether the pattern is case sensitive.


        :param is_case_sensitive: The is_case_sensitive of this CustomPiiRule.
        :type: bool
        """
        self._is_case_sensitive = is_case_sensitive

    @property
    def max_distance(self):
        """
        Gets the max_distance of this CustomPiiRule.
        Maximum distance for pattern matching.


        :return: The max_distance of this CustomPiiRule.
        :rtype: int
        """
        return self._max_distance

    @max_distance.setter
    def max_distance(self, max_distance):
        """
        Sets the max_distance of this CustomPiiRule.
        Maximum distance for pattern matching.


        :param max_distance: The max_distance of this CustomPiiRule.
        :type: int
        """
        self._max_distance = max_distance

    @property
    def priority(self):
        """
        Gets the priority of this CustomPiiRule.
        Priority of this rule.


        :return: The priority of this CustomPiiRule.
        :rtype: int
        """
        return self._priority

    @priority.setter
    def priority(self, priority):
        """
        Sets the priority of this CustomPiiRule.
        Priority of this rule.


        :param priority: The priority of this CustomPiiRule.
        :type: int
        """
        self._priority = priority

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
