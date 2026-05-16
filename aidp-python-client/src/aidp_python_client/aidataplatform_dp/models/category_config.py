# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CategoryConfig(object):
    """
    Configuration for a guardrail category
    """

    #: A constant which can be used with the action property of a CategoryConfig.
    #: This constant has a value of "BLOCK"
    ACTION_BLOCK = "BLOCK"

    #: A constant which can be used with the action property of a CategoryConfig.
    #: This constant has a value of "INFORM"
    ACTION_INFORM = "INFORM"

    #: A constant which can be used with the action property of a CategoryConfig.
    #: This constant has a value of "MASK"
    ACTION_MASK = "MASK"

    def __init__(self, **kwargs):
        """
        Initializes a new CategoryConfig object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param category:
            The value to assign to the category property of this CategoryConfig.
        :type category: str

        :param is_enabled:
            The value to assign to the is_enabled property of this CategoryConfig.
        :type is_enabled: bool

        :param threshold:
            The value to assign to the threshold property of this CategoryConfig.
        :type threshold: float

        :param action:
            The value to assign to the action property of this CategoryConfig.
            Allowed values for this property are: "BLOCK", "INFORM", "MASK"
        :type action: str

        """
        self.swagger_types = {
            'category': 'str',
            'is_enabled': 'bool',
            'threshold': 'float',
            'action': 'str'
        }

        self.attribute_map = {
            'category': 'category',
            'is_enabled': 'isEnabled',
            'threshold': 'threshold',
            'action': 'action'
        }

        self._category = None
        self._is_enabled = None
        self._threshold = None
        self._action = None

    @property
    def category(self):
        """
        Gets the category of this CategoryConfig.
        Category


        :return: The category of this CategoryConfig.
        :rtype: str
        """
        return self._category

    @category.setter
    def category(self, category):
        """
        Sets the category of this CategoryConfig.
        Category


        :param category: The category of this CategoryConfig.
        :type: str
        """
        self._category = category

    @property
    def is_enabled(self):
        """
        Gets the is_enabled of this CategoryConfig.
        Whether this category is enabled


        :return: The is_enabled of this CategoryConfig.
        :rtype: bool
        """
        return self._is_enabled

    @is_enabled.setter
    def is_enabled(self, is_enabled):
        """
        Sets the is_enabled of this CategoryConfig.
        Whether this category is enabled


        :param is_enabled: The is_enabled of this CategoryConfig.
        :type: bool
        """
        self._is_enabled = is_enabled

    @property
    def threshold(self):
        """
        Gets the threshold of this CategoryConfig.
        Threshold value for this category (0.0 to 1.0)


        :return: The threshold of this CategoryConfig.
        :rtype: float
        """
        return self._threshold

    @threshold.setter
    def threshold(self, threshold):
        """
        Sets the threshold of this CategoryConfig.
        Threshold value for this category (0.0 to 1.0)


        :param threshold: The threshold of this CategoryConfig.
        :type: float
        """
        self._threshold = threshold

    @property
    def action(self):
        """
        Gets the action of this CategoryConfig.
        Action to take for this category

        Allowed values for this property are: "BLOCK", "INFORM", "MASK"


        :return: The action of this CategoryConfig.
        :rtype: str
        """
        return self._action

    @action.setter
    def action(self, action):
        """
        Sets the action of this CategoryConfig.
        Action to take for this category


        :param action: The action of this CategoryConfig.
        :type: str
        """
        allowed_values = ["BLOCK", "INFORM", "MASK"]
        if not value_allowed_none_or_none_sentinel(action, allowed_values):
            raise ValueError(
                "Invalid value for `action`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._action = action

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
