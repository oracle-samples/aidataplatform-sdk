# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class PiiCategory(object):
    """
    PII category configuration
    """

    #: A constant which can be used with the category property of a PiiCategory.
    #: This constant has a value of "PERSON"
    CATEGORY_PERSON = "PERSON"

    #: A constant which can be used with the category property of a PiiCategory.
    #: This constant has a value of "ADDRESS"
    CATEGORY_ADDRESS = "ADDRESS"

    #: A constant which can be used with the category property of a PiiCategory.
    #: This constant has a value of "TELEPHONE_NUMBER"
    CATEGORY_TELEPHONE_NUMBER = "TELEPHONE_NUMBER"

    #: A constant which can be used with the category property of a PiiCategory.
    #: This constant has a value of "EMAIL"
    CATEGORY_EMAIL = "EMAIL"

    #: A constant which can be used with the action property of a PiiCategory.
    #: This constant has a value of "BLOCK"
    ACTION_BLOCK = "BLOCK"

    #: A constant which can be used with the action property of a PiiCategory.
    #: This constant has a value of "INFORM"
    ACTION_INFORM = "INFORM"

    #: A constant which can be used with the action property of a PiiCategory.
    #: This constant has a value of "MASK"
    ACTION_MASK = "MASK"

    def __init__(self, **kwargs):
        """
        Initializes a new PiiCategory object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param category:
            The value to assign to the category property of this PiiCategory.
            Allowed values for this property are: "PERSON", "ADDRESS", "TELEPHONE_NUMBER", "EMAIL"
        :type category: str

        :param is_enabled:
            The value to assign to the is_enabled property of this PiiCategory.
        :type is_enabled: bool

        :param action:
            The value to assign to the action property of this PiiCategory.
            Allowed values for this property are: "BLOCK", "INFORM", "MASK"
        :type action: str

        :param threshold:
            The value to assign to the threshold property of this PiiCategory.
        :type threshold: float

        """
        self.swagger_types = {
            'category': 'str',
            'is_enabled': 'bool',
            'action': 'str',
            'threshold': 'float'
        }

        self.attribute_map = {
            'category': 'category',
            'is_enabled': 'isEnabled',
            'action': 'action',
            'threshold': 'threshold'
        }

        self._category = None
        self._is_enabled = None
        self._action = None
        self._threshold = None

    @property
    def category(self):
        """
        **[Required]** Gets the category of this PiiCategory.
        PII category name (e.g., SSN, EMAIL, PHONE_NUMBER)

        Allowed values for this property are: "PERSON", "ADDRESS", "TELEPHONE_NUMBER", "EMAIL"


        :return: The category of this PiiCategory.
        :rtype: str
        """
        return self._category

    @category.setter
    def category(self, category):
        """
        Sets the category of this PiiCategory.
        PII category name (e.g., SSN, EMAIL, PHONE_NUMBER)


        :param category: The category of this PiiCategory.
        :type: str
        """
        allowed_values = ["PERSON", "ADDRESS", "TELEPHONE_NUMBER", "EMAIL"]
        if not value_allowed_none_or_none_sentinel(category, allowed_values):
            raise ValueError(
                "Invalid value for `category`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._category = category

    @property
    def is_enabled(self):
        """
        **[Required]** Gets the is_enabled of this PiiCategory.
        Whether this category is enabled


        :return: The is_enabled of this PiiCategory.
        :rtype: bool
        """
        return self._is_enabled

    @is_enabled.setter
    def is_enabled(self, is_enabled):
        """
        Sets the is_enabled of this PiiCategory.
        Whether this category is enabled


        :param is_enabled: The is_enabled of this PiiCategory.
        :type: bool
        """
        self._is_enabled = is_enabled

    @property
    def action(self):
        """
        **[Required]** Gets the action of this PiiCategory.
        Action to take for this category

        Allowed values for this property are: "BLOCK", "INFORM", "MASK"


        :return: The action of this PiiCategory.
        :rtype: str
        """
        return self._action

    @action.setter
    def action(self, action):
        """
        Sets the action of this PiiCategory.
        Action to take for this category


        :param action: The action of this PiiCategory.
        :type: str
        """
        allowed_values = ["BLOCK", "INFORM", "MASK"]
        if not value_allowed_none_or_none_sentinel(action, allowed_values):
            raise ValueError(
                "Invalid value for `action`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._action = action

    @property
    def threshold(self):
        """
        Gets the threshold of this PiiCategory.
        Detection threshold for this category


        :return: The threshold of this PiiCategory.
        :rtype: float
        """
        return self._threshold

    @threshold.setter
    def threshold(self, threshold):
        """
        Sets the threshold of this PiiCategory.
        Detection threshold for this category


        :param threshold: The threshold of this PiiCategory.
        :type: float
        """
        self._threshold = threshold

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
